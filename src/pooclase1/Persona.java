
package pooclase1;

public class Persona {
    
    String nombre;
    String apellido;
    int fechaNac;
    int cedula;
    boolean estudiante;
    
    
    
    //Constructor de una persona
    
    public Persona(String nombre,String apellido,int fechaNac,int cedula, boolean estudiante){
        this.nombre = nombre;
        this.apellido = apellido;
        this.fechaNac = fechaNac;
        this.cedula = cedula;
        this.estudiante = estudiante;
        
        
        
    }
    
    public String getNombre(){
        
        return this.nombre;
    }
    
    public void setNombre(String nombre){
        
        this.nombre = nombre;
        
    }

    public int getFechaNac() {
        return fechaNac;
    }

    public int getCedula() {
        return cedula;
    }

    public boolean isEstudiante() {
        return estudiante;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setFechaNac(int fechaNac) {
        this.fechaNac = fechaNac;
    }

    public void setCedula(int cedula) {
        this.cedula = cedula;
    }

    public void setEstudiante(boolean estudiante) {
        this.estudiante = estudiante;
    }
    
    
    
    
    
}

