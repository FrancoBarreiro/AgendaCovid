
package logica;

public class usuarioMSP extends Usuario {
    int numeroFuncionario;
    
    public usuarioMSP (int usuario, String contrasenia, int numeroFuncionario){
        super(usuario, contrasenia);
        this.numeroFuncionario=numeroFuncionario;
    }
    
}
