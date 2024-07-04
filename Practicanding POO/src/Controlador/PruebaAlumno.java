package Controlador;
import Modelo.Alumno;
import java.util.Scanner;

public class PruebaAlumno {

    public Alumno[] alumnos;
    public int numeroAlumnos;
    
    public PruebaAlumno(int numeroAlumnos) {
        this.numeroAlumnos = numeroAlumnos;
        this.alumnos =new Alumno[numeroAlumnos];    
    }
    
    public void ingresarAlumnos(){
        Scanner lc = new Scanner(System.in);
        for (int i = 0; i < numeroAlumnos; i++) {
            System.out.println("Ingrese foto del alumno ");
            String foto = lc.nextLine();
            System.out.println("Ingrese nombre del alumno ");
            String nombre = lc.nextLine();
            System.out.println("Ingrese edad del alumno ");
            int edad = lc.nextInt();
            System.out.println("Ingrese nota de PC1 del alumno ");
            int pc1 = lc.nextInt();
            System.out.println("Ingrese nota de PC2 del alumno ");
            int pc2 = lc.nextInt();
            System.out.println("Ingrese nota de PC3 del alumno ");
            int pc3 = lc.nextInt();
            System.out.println("Ingrese nota de EF del alumno ");
            int ef = lc.nextInt();
            lc.nextLine();
            
            Alumno alumno1 = new Alumno (foto, nombre, edad, pc1, pc2, pc3, ef);
            alumnos [i] = alumno1;
        }
    }
    public void imprimirAlumnos() {
        for (int i = 0; i < numeroAlumnos; i++) {
            System.out.println("Foto: "+alumnos[i].getFoto());
            System.out.println("Nombre: "+alumnos[i].getNombre());
            System.out.println("Edad: "+alumnos[i].getEdad());
            System.out.println("Pc1: "+alumnos[i].getPc1());
            System.out.println("Pc2: "+alumnos[i].getPc2());
            System.out.println("Pc3: "+alumnos[i].getPc3());
            System.out.println("Ef: "+alumnos[i].getEf());
        }
    }
}
