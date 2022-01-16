
package logica;

public class Usuario {
    private int usuario;
    private String contrasenia;
    private String tipoUsuario;


    public Usuario (int usuario, String contrasenia, String tipoUsuario){
        this.usuario=usuario;
        this.contrasenia=contrasenia;
        this.tipoUsuario=tipoUsuario;
    }

    public Usuario (int usuario, String contrasenia){
        this.usuario=usuario;
        this.contrasenia=contrasenia;
    }
    
    public int getUsuario(){
        return usuario;
    }
    
    public void setUsuario(int usuario){
        this.usuario=usuario;
    }
    
    public String getContrasenia(){
        return contrasenia;
    }
    public void setContrasenia(String nuevaContrasenia){
        this.contrasenia=nuevaContrasenia;
    }

    public String getTipoUsuario(){
        return tipoUsuario;
    }
    
    public void setTipoUsuario(String tipoUsuario){
        this.tipoUsuario=tipoUsuario;
    }
}