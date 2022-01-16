
package logica;

import java.util.Date;

public class Vacuna {
    
    public enum TipoVacuna {SINOVAC, PFIZER, ASTRAZENECA};
        private int idVacuna=0;
        private String fechaVencimiento;
        private int dosisDisponibles;
        private String laboratorio;
        private TipoVacuna tipoVacuna;
    
    public Vacuna (int idVacuna, TipoVacuna tipoVacuna, String fechaVencimiento, int dosisDisponibles, String laboratorio){
        
        this.idVacuna=idVacuna;
        this.tipoVacuna=tipoVacuna;
        this.fechaVencimiento=fechaVencimiento;
        this.dosisDisponibles=dosisDisponibles;
        this.laboratorio=laboratorio;
    }
    
    public Vacuna (TipoVacuna tipoVacuna, String fechaVencimiento, int dosisDisponibles, String laboratorio){
        
        this.tipoVacuna=tipoVacuna;
        this.fechaVencimiento=fechaVencimiento;
        this.dosisDisponibles=dosisDisponibles;
        this.laboratorio=laboratorio;
    }
    
    public String getFechaVencimiento(){
        return fechaVencimiento;
    }
    
    public void setFechaVencimiento(String fechaVencimiento){
        this.fechaVencimiento=fechaVencimiento;
    }
    
    public int getDosisDisponibles(){
        return dosisDisponibles;
    }
    
    public void setDosisDisponibles(int dosisDisponibles){
        this.dosisDisponibles=dosisDisponibles;
    }
    
    public String getLaboratorio(){
        return laboratorio;
    }
    
    public void setLaboratorio(String laboratorio){
        this.laboratorio=laboratorio;
    }

    public TipoVacuna getTipoVacuna() {
        return tipoVacuna;
    }

    public void setTipoVacuna(TipoVacuna tipoVacuna) {
        this.tipoVacuna = tipoVacuna;
    }
    
    public int getIdVacuna(){
        return idVacuna;
    }
    
    public void setIdVacuna(int idVacuna){
    this.idVacuna = idVacuna;
}
}
