
package logica;

import java.util.ArrayList;

public class Barrio {
    private String nombre;
    private int distancia; //distancia en metros respecto al barrio de referencia (Tres Cruces)

    public Barrio(String nombre, int distancia){
        this.nombre=nombre;
        this.distancia=distancia;
    }
    
    public String getNombre(){
        return nombre;
    }
    
    public void setNombre(String nombre){
        this.nombre=nombre;
    }
    
    public int getDistancia(){
        return distancia;
    }
    
    public void setDistancia(int distancia){
        this.distancia=distancia;
    }
}
