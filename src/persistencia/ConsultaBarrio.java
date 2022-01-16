
package persistencia;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import logica.Barrio;
import java.sql.ResultSet;

public class ConsultaBarrio extends Conexion {
    
    public ConsultaBarrio()throws FileNotFoundException, IOException, ClassNotFoundException, SQLException{
    
    }
    
    public ArrayList <Barrio> listaBarrios() throws SQLException{
        ResultSet consulta = consulta("SELECT * FROM barrio)");
        ArrayList <Barrio> listaBarrios = new ArrayList<>();
        
        while(consulta.next()){
            String nombre=consulta.getString("nombre");
            int distancia=consulta.getInt("distancia");
            Barrio barrio = new Barrio(nombre, distancia);
            listaBarrios.add(barrio);
        }     
        return listaBarrios;
    }

    void consultaVacunatorio(String barrio) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
