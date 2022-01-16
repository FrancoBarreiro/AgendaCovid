
package logica;

import java.io.Serializable;
import java.util.Date;
import persistencia.Persistencia;

public class MSP implements Serializable {

    private Vacuna vacuna;
    private Vacunatorio vacunatorio;
    
    public MSP(Vacuna vacuna, Vacunatorio vacunatorio){
        this.vacuna=vacuna;
        this.vacunatorio=vacunatorio;
    }
    
    public MSP(){
        
    }
    
    public int intervaloEdadInferior(int edadInferior){
        return edadInferior;   
    }
    
    public int intervaloEdadSuperior(int edadSuperior){
        return edadSuperior;   
    }
    
    public int totalVacunados(){
        int contador=0;
        return contador;
    }
    
    public int totalAgendados(){
        int contador=0;
        return contador;
    }

    public int porcentajeVacunados(){
        int porcentaje=0;
        return porcentaje;
    }
    
    public int inmunidadRebanio(){
        int inmunidad=0;
        return inmunidad;
    }

    public boolean enviarVacunas(Vacuna vacuna, int cantidadDosisEnviar, String vacunatorio) {
        boolean enviar=false;
        if(vacuna.getDosisDisponibles()>=cantidadDosisEnviar){
            enviar=true;
        }
        return enviar;
    }

    public boolean controlRangoHabilitados(int edadInferior, int edadSuperior) {
        boolean control = false;
        if(edadInferior < edadSuperior){
            control = true;
        }
        return control;
    }
    
}
