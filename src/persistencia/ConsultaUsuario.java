
package persistencia;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import logica.Usuario;

public class ConsultaUsuario extends Conexion {

    public ConsultaUsuario() throws ClassNotFoundException, SQLException, FileNotFoundException, IOException {

    }
    
    public Usuario buscarUsuario(Usuario usuario) throws SQLException {
       
        PreparedStatement consulta = consultaPrepare("Select * From Usuarios Where Numero_Usuario = ?");
        consulta.setInt(1, usuario.getUsuario());
        ResultSet resultado = consulta.executeQuery();
        
        String contraseniaEnBaseDatos=null;
        if(resultado.next()){
            contraseniaEnBaseDatos = resultado.getString("Contrasenia");
            if(usuario.getContrasenia().equals(contraseniaEnBaseDatos)){
                usuario.setTipoUsuario(resultado.getString("Tipo_Usuario"));
            }
        }
        return usuario;
    }

    public Usuario obtenerTipoUsuario(Usuario usuario) throws SQLException {
        PreparedStatement consulta = consultaPrepare("Select Tipo_Usuario From Usuarios Where Numero_Usuario = ?");
        consulta.setInt(1, usuario.getUsuario());
        
        ResultSet resultado = consulta.executeQuery();
        if(resultado.next()){
            usuario.setTipoUsuario("Tipo_Usuario");
        }
        return usuario;
    }
    
    
}
