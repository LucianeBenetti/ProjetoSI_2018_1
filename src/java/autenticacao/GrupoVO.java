
package autenticacao;

public class GrupoVO {
    
    private String grupo;
    private int idUsuario;

    public GrupoVO() {
    }

    public GrupoVO(String grupo, int idUsuario) {
        this.grupo = grupo;
        this.idUsuario = idUsuario;
    }

    public String getGrupo() {
        return grupo;
    }

    public void setGrupo(String grupo) {
        this.grupo = grupo;
    }

    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }
    
    
    
}
