package autenticacao;
public class UsuarioSenhaVO {
	
	private String login;
	private String senha;
        private int nivelAcesso;
        private String grupo;

    public UsuarioSenhaVO() {
    }

    public UsuarioSenhaVO(String login, String senha, int nivelAcesso, String grupo) {
        this.login = login;
        this.senha = senha;
        this.nivelAcesso = nivelAcesso;
        this.grupo = grupo;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public int getNivelAcesso() {
        return nivelAcesso;
    }

    public void setNivelAcesso(int nivelAcesso) {
        this.nivelAcesso = nivelAcesso;
    }

    public String getGrupo() {
        return grupo;
    }

    public void setGrupo(String grupo) {
        this.grupo = grupo;
    }
        
        

}