
package persistencia;

import logica.Vacuna;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;
import logica.Vacuna.TipoVacuna;

public class ConsultaVacuna extends Conexion {
    
    public ConsultaVacuna() throws ClassNotFoundException, SQLException, FileNotFoundException, IOException {
        
    }

    public void registrarVacunas(Vacuna vacuna) throws SQLException {
        PreparedStatement consulta=actualizar("INSERT INTO stock_vacunas (Tipo_Vacuna, Fecha_Vencimiento, Dosis_Disponibles, Laboratorio) VALUES (?, ?, ?, ?)");
        String tipoVacuna="";
        switch (vacuna.getTipoVacuna()){
            case SINOVAC: tipoVacuna="Sinovac"; break;
            case PFIZER: tipoVacuna="Pfizer"; break;
            case ASTRAZENECA: tipoVacuna="Astrazeneca"; break;
        }
        consulta.setString(1,tipoVacuna);
        consulta.setString(2,vacuna.getFechaVencimiento());
        consulta.setInt(3, vacuna.getDosisDisponibles());
        consulta.setString(4, vacuna.getLaboratorio());
        consulta.executeUpdate();
    }

    public DefaultTableModel listaVacunas(DefaultTableModel tablaVacunas) throws SQLException {
        ResultSet resultado = consulta("SELECT * FROM stock_vacunas");
        String []listaVacunas = new String[5];
                
        while(resultado.next()){
            listaVacunas[0] = resultado.getString("Id_Vacuna");
            listaVacunas[1] = resultado.getString("Tipo_Vacuna");
            listaVacunas[2] = resultado.getString("Dosis_Disponibles");
            listaVacunas[3] = resultado.getString("Fecha_Vencimiento");
            listaVacunas[4] = resultado.getString("Laboratorio");
            tablaVacunas.addRow(listaVacunas);
        }
       return tablaVacunas;
    }
     
}
