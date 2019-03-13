package autenticacao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class AcessarSistemaDAO  {

    public UsuarioSenhaVO consultaBanco(String login, String senha, String grupo) {
        UsuarioSenhaVO usuario = null;
        String query = "SELECT usuario.login, usuario.senha, usuario.nivelacesso, grupo.grupo FROM usuario as usuario inner join grupo as grupo on usuario.idusuario = grupo.idusuario" + " WHERE login= '" + login + "' and senha= md5('" + senha +"')";

	Connection conn = Banco.getConnection();
	Statement stmt = Banco.getStatement(conn);
        ArrayList<UsuarioSenhaVO> usuarios = new ArrayList<UsuarioSenhaVO>();
	
        ResultSet resultado = null;
        try {
            resultado = stmt.executeQuery(query);
		while (resultado.next()) {
                  usuario = new UsuarioSenhaVO();
                                                     
                  usuario.setLogin(resultado.getString(1));
                  usuario.setSenha(resultado.getString(2));
                  usuario.setNivelAcesso(resultado.getInt(3));
                  usuario.setGrupo(resultado.getString(4));
               
              
                 usuarios.add(usuario);
                               
                }
			
		}catch (SQLException e) {
			System.out.println("Erro ao executar Query (SI) que autentica os usuários! Causa: " + e.getMessage());
		}finally {
			Banco.closeResultSet(resultado);
			Banco.closeStatement(stmt);
			Banco.closeConnection(conn);
		}
	return 	usuario;
        
	}
    
}  
	
	
	