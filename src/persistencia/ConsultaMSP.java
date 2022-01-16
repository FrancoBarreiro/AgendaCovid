
package persistencia;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.util.ArrayList;


public class ConsultaMSP extends Conexion {
    
    public ConsultaMSP()throws ClassNotFoundException, SQLException, FileNotFoundException, IOException{
        
    }

    public void ingresarRangoHabilitados(int edadInferior, int edadSuperior) throws SQLException {
        PreparedStatement consulta = actualizar("Update rango_habilitados SET Edad_Menor=?, Edad_Mayor = ? Where Id_Rango = 1");
        consulta.setInt(1, edadInferior);
        consulta.setInt(2, edadSuperior);
        consulta.executeUpdate();
    }  

    public boolean ingresarHabilitados(String tipoVacuna, int edadInferior, int edadSuperior) throws SQLException {
        boolean seIngreso = false;
        int edadInferiorEnBaseDatos=0;
        int edadSuperiorEnBaseDatos=0;
        int tamanioArreglo=0;
                 
        PreparedStatement consulta = consultaPrepare("SELECT COUNT(Intervalo_Edades) FROM habilitados");
        
        ResultSet resultado = consulta.executeQuery();
       
       if(resultado.next()){
            tamanioArreglo = Integer.parseInt(resultado.getString("COUNT(Intervalo_Edades)"));
        }
        String intervalos[] = new String[tamanioArreglo];
        String intervaloSeparado[] = new String[2];
        int i=0;
        int k=0;
        String intervalo=null;
        if(tamanioArreglo > 0){
            consulta = consultaPrepare("SELECT Intervalo_Edades FROM habilitados");
            resultado = consulta.executeQuery();
            while (resultado.next()) {
                intervalos[i] = resultado.getString("Intervalo_Edades");
                i++; }
            
            while(k<tamanioArreglo) {
            intervalo = intervalos[k];
            intervaloSeparado = intervalo.split("-");
            edadInferiorEnBaseDatos = Integer.parseInt(intervaloSeparado[0]);
            edadSuperiorEnBaseDatos = Integer.parseInt(intervaloSeparado[1]);

                if((edadSuperior > edadSuperiorEnBaseDatos && edadInferior > edadSuperiorEnBaseDatos) || (edadSuperior < edadInferiorEnBaseDatos && edadInferior < edadInferiorEnBaseDatos)){
                    k++;
                    if(k == (tamanioArreglo)){
                        consulta = actualizar("INSERT INTO habilitados (Tipo_Vacuna, Intervalo_Edades) VALUES (?, ?)");
                        consulta.setString(1, tipoVacuna);
                        consulta.setString(2, edadInferior+"-"+edadSuperior);
                        consulta.executeUpdate();
                        seIngreso=true;
                    }         
                } else {
                    k=tamanioArreglo;
                }
            }
        } else {
            consulta = actualizar("INSERT INTO habilitados (Tipo_Vacuna, Intervalo_Edades) VALUES (?, ?)");
            consulta.setString(1, tipoVacuna);
            consulta.setString(2, edadInferior+"-"+edadSuperior);
            consulta.executeUpdate();
            seIngreso=true;
        }
         return seIngreso;
    }
}
