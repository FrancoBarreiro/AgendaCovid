
package persistencia;

import grafica.MenuUsuario;
import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;
import logica.Usuario;
import logica.Vacuna;
import logica.Vacuna.TipoVacuna;


public class Persistencia {
   
    private static Persistencia objeto=null;
    
    private Persistencia(){   
    }
    
    public static Persistencia getInstance()
    {
        if(objeto==null)
        {
            objeto=new Persistencia();
        }
        return objeto;
    }

    public void registrarVacunas(Vacuna vacuna) throws ClassNotFoundException, SQLException, IOException {
        ConsultaVacuna consulta=new ConsultaVacuna();
        consulta.registrarVacunas(vacuna);
    }

    public DefaultTableModel tablaVacunas(DefaultTableModel tablaVacunas) throws ClassNotFoundException, SQLException, IOException {
        ConsultaVacuna consulta = new ConsultaVacuna();
        return consulta.listaVacunas(tablaVacunas);
    }

    public void enviarVacunas(Vacuna vacuna, int cantidadDosisEnviar, String vacunatorio) throws SQLException, IOException, ClassNotFoundException {
        ConsultaVacunatorio consulta = new ConsultaVacunatorio();
        consulta.enviarVacunas(vacuna, cantidadDosisEnviar, vacunatorio);
    }

    public void agendarse(String nombre, String apellido, Date fechaNacimiento, String barrio) {
        try {
            ConsultaBarrio consulta = new ConsultaBarrio();
            consulta.consultaVacunatorio(barrio);
            
        } catch (IOException ex) {
            Logger.getLogger(Persistencia.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Persistencia.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(Persistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public Usuario buscarUsuario(Usuario usuario) throws SQLException, ClassNotFoundException, IOException {
        ConsultaUsuario consulta = new ConsultaUsuario();
        consulta.buscarUsuario(usuario);
        return usuario;
    }    

    public void ingresarRangoHabilitados(int edadInferior, int edadSuperior) throws ClassNotFoundException, SQLException, IOException {   
        ConsultaMSP consulta = new ConsultaMSP();
        consulta.ingresarRangoHabilitados(edadInferior, edadSuperior);
    }

    public boolean ingresarHabilitados(String tipoVacuna, int edadInferior, int edadSuperior) throws ClassNotFoundException, SQLException, IOException {
        ConsultaMSP consulta = new ConsultaMSP();
        return consulta.ingresarHabilitados(tipoVacuna, edadInferior, edadSuperior);
    }
}
