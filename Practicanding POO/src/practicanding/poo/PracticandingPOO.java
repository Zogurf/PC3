/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package practicanding.poo;

public class PracticandingPOO {
    
    public static void main (String[] args) {
            // alumno vacio
            Alumno alumno1 = new Alumno();
            // alumno con valores
            Alumno alumno2 = new Alumno(5, "Jair", "Villalta");
            
            alumno1.nombre = "Jair";

           System.out.println("El id del alumno 1 es: "+ alumno2.getId());
           // en el vacio, String es null y un numero es 0 o 0.0
           System.out.println("El alumno 2 es: "+alumno1.getId());
           
           // se puede sobreescribir un set
    }   
}
