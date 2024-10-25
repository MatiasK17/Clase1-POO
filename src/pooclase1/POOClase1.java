
package pooclase1;

import java.util.Scanner;

public class POOClase1 {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        Persona persona1 = new Persona("Matias","Kalemkerian",1999,49406116,true);
        Persona persona2 = new Persona("Juan","Kalemkerian",1999,49406116,true);
        
        System.out.println("Dime tu nuevo nombre");
        String nombre = input.nextLine();
        
        persona1.setNombre(nombre);
                
        
        System.out.println(" Soy un objeto llamado: " + persona1.getNombre());
        System.out.println(" Soy un objeto llamado: " + persona2.getNombre());
        
       
  
    }
    
}
