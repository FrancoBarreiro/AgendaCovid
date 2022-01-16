
package logica;

import java.io.IOException;
import java.io.Serializable;
import java.sql.SQLException;
import java.util.Date;
import javax.swing.table.DefaultTableModel; 
import logica.Vacuna.TipoVacuna;

import persistencia.Persistencia;


public class Sistema implements Serializable {
    
    private static Sistema objeto = null;
    
    public static Sistema getInstance(){
        if (objeto == null){
            objeto = new Sistema();
        }
        return objeto; 
    }
    
    public void agregarPersona(){
        
        
    }

    public void registrarVacunas(Vacuna vacuna) throws ClassNotFoundException, SQLException, IOException {
        if (vacuna.getDosisDisponibles()>0){
            Persistencia.getInstance().registrarVacunas(vacuna);
        }
    }

    public DefaultTableModel tablaVacunas() throws ClassNotFoundException, SQLException, IOException {
        DefaultTableModel tablaVacunas = new DefaultTableModel();
        tablaVacunas.addColumn("Id Vacuna");
        tablaVacunas.addColumn("Tipo Vacuna");
        tablaVacunas.addColumn("Dosis Disponibles");
        tablaVacunas.addColumn("Fecha Vto.");
        tablaVacunas.addColumn("Laboratorio");
        return Persistencia.getInstance().tablaVacunas(tablaVacunas);
    }

    public void enviarVacunas(Vacuna vacuna, int cantidadDosisEnviar, String vacunatorio) throws SQLException, IOException, ClassNotFoundException, Exception {
        MSP msp = new MSP();
        
        boolean enviar = msp.enviarVacunas(vacuna, cantidadDosisEnviar, vacunatorio);
        if(enviar){
            Persistencia.getInstance().enviarVacunas(vacuna, cantidadDosisEnviar, vacunatorio);
        } 
        
    }

    public void agendarse(String nombre, String apellido, Date fechaNacimiento, String barrio) {
        Persistencia.getInstance().agendarse(nombre, apellido, fechaNacimiento, barrio);
    }

    public Usuario buscarUsuario(Usuario usuario) throws SQLException, ClassNotFoundException, IOException {
        Persistencia.getInstance().buscarUsuario(usuario);
        return usuario;
    }

    public boolean actualizarRangoHabilitados(int edadInferior, int edadSuperior) throws ClassNotFoundException, SQLException, IOException {
        MSP msp = new MSP();
        boolean control = msp.controlRangoHabilitados(edadInferior, edadSuperior);
        if(control){
        Persistencia.getInstance().ingresarRangoHabilitados(edadInferior, edadSuperior);
        }
        return control;
    }

    public boolean ingresarHabilitados(String tipoVacuna, int edadInferior, int edadSuperior) throws ClassNotFoundException, SQLException, IOException {
        MSP msp = new MSP();
        boolean controlEdades = msp.controlRangoHabilitados(edadInferior, edadSuperior);
        if(controlEdades){
            return Persistencia.getInstance().ingresarHabilitados(tipoVacuna, edadInferior, edadSuperior); 
        } else {
            return false;
        } 
    }
}