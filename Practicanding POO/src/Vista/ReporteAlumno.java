/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Vista;
import Controlador.PruebaAlumno;
import java.util.Scanner;

public class ReporteAlumno {
    public static void main (String[] args){
        Scanner lc = new Scanner(System.in);
        
        System.out.println("Cuantos alumnos hay");
        int numeroAlumnos = lc.nextInt();
        
        PruebaAlumno controlador = new PruebaAlumno(numeroAlumnos);
        controlador.ingresarAlumnos();
        controlador.imprimirAlumnos();
        
        
    }
}
