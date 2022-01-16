package persistencia;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.table.DefaultTableModel;
import logica.Sistema;
import logica.Vacuna;
import logica.Vacuna.TipoVacuna;

public class ConsultaVacunatorio extends Conexion {
 
    public ConsultaVacunatorio() throws ClassNotFoundException, SQLException, FileNotFoundException, IOException {
        
    }
   
    public ConsultaVacunatorio(String barrio) throws ClassNotFoundException, SQLException, FileNotFoundException, IOException {
        PreparedStatement consulta = consultaPrepare("SELECT direccion FROM vacunatorio WHERE Barrio=?");
        consulta.setString(1, barrio);
        ResultSet resultado= consulta.executeQuery();
        String direccion= null;
        if (resultado.next()){
            direccion = resultado.getString("direccion");
        }
       
        
} 

    public void enviarVacunas(Vacuna vacuna, int cantidadDosisEnviar, String vacunatorio) throws SQLException, IOException, ClassNotFoundException {

        int idVacunatorio = 0;
        PreparedStatement consulta = consultaPrepare("SELECT Id_Vacunatorio FROM Vacunatorio WHERE Id_Barrio=(SELECT Id_Barrio FROM Barrio WHERE Nombre=?)");
        consulta.setString(1, vacunatorio);
        ResultSet resultado = consulta.executeQuery();
        if (resultado.next()) {
            idVacunatorio = resultado.getInt("Id_Vacunatorio");
        }
        PreparedStatement insertar = actualizar("INSERT INTO vacunas_distribuidas (Id_Vacuna, Id_Vacunatorio, Cantidad_Dosis) VALUES (?,?,?)");
        insertar.setInt(1, vacuna.getIdVacuna());
        insertar.setInt(2, idVacunatorio);
        insertar.setInt(3, cantidadDosisEnviar);
        insertar.executeUpdate();
        /*
        int stockNuevo = vacuna.getDosisDisponibles() - cantidadDosisEnviar;
        if (stockNuevo==0) {
            PreparedStatement actualizar=actualizar("DELETE FROM stock_vacunas WHERE Id_Vacuna=?");
            actualizar.setInt(1, vacuna.getIdVacuna());
            actualizar.executeUpdate();
        } else {
            PreparedStatement actualizar=actualizar("UPDATE stock_vacunas SET Dosis_Disponibles=? WHERE Id_Vacuna=?");
            actualizar.setInt(1, stockNuevo);
            actualizar.setInt(2, vacuna.getIdVacuna());
            actualizar.executeUpdate();
        }*/
    }
 }
