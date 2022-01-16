
package logica;

import java.util.ArrayList;

public class Vacunatorio {
    private String direccion;
    private Barrio barrio;
    private int espacioDisponible;
    private int cantidadEnfermeros;
    private ArrayList<Vacuna>vacuna;
    
    public Vacunatorio(String direccion, Barrio barrio, int espacioDisponible, int cantidadEnfermeros){
        this.direccion=direccion;
        this.barrio=barrio;
        this.espacioDisponible=espacioDisponible;
        this.cantidadEnfermeros=cantidadEnfermeros;        
    }
    
    public int capacidadVacunar(int espacioDisponible, int cantidadEnfermeros){
        int capacidadVacunar=0;
        return capacidadVacunar;
    }
    
}
