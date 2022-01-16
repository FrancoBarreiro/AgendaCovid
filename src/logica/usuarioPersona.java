
package logica;

import java.util.ArrayList;
import java.util.Date;

public class usuarioPersona extends Usuario {
    
    private String nombre;
    private String apellido;
    private int cedula;
    private String fechaNacimiento;
    private Barrio barrio;
    
  
    public usuarioPersona (int usuario, String contrasenia, String nombre, String apellido, Barrio barrio){
        super(usuario, contrasenia);
        this.nombre=nombre;
        this.apellido=apellido;
        this.cedula=usuario;
        this.fechaNacimiento=contrasenia;
        this.barrio=barrio;
        
    }
    
    public int calculoEdad(){
        int edad=0;
        return edad;
    }
    
    public boolean habilitado(){
        boolean habilitado=false;
        return habilitado;
    }
    
    public ArrayList<usuarioPersona> agendado(){
        
        ArrayList<usuarioPersona> agendado = new ArrayList<>();
        
        return agendado;
     
    }
    public ArrayList<usuarioPersona> sinAgendarse(){
        
        ArrayList<usuarioPersona> sinAgendarse = new ArrayList<>();
        
        return sinAgendarse;
     
    }
    public ArrayList<usuarioPersona> vacunado(){
        
        ArrayList<usuarioPersona> vacunado = new ArrayList<>();
        
        return vacunado;
     
    }
}
