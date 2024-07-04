package Modelo;
import java.util.Scanner;
import  java.util.InputMismatchException;

public class LectorDatos {
    private Scanner lc;
    
    public LectorDatos() {
        lc = new Scanner(System.in);
    }
    
    public int leerEntero(String mensaje) {
        int numero = 0;
        boolean entradaValida = true;
        
        do {
            try {
                System.out.println("Mensaje");
                numero = lc.nextInt();
            } catch (InputMismatchException e) { 
                System.out.println("Entrada no valida, vuelva ingresar el numero");
                lc.nextLine();
            }
        } while (!entradaValida);
        return numero;
    }
    
    public double leerDouble (String mensaje) {
        double numero = 0;
        boolean entradaValida = true;
        
        do {
            try {
                System.out.println("Mensaje");
                numero = lc.nextDouble();
            } catch (InputMismatchException e) {
                System.out.println("Entrada no valida, vuelva a ingresar el numero");
                lc.nextLine();
            }
        } while (!entradaValida);
        return numero; 
    }
    
    public char leerChar(String mensaje) {  
        // Char lleva comilla simple
         char caracter = ' ';
         boolean entradaValida = true;
         
         do {
             try {
                 System.out.println("Ingrese valor");
                 caracter = lc.next().charAt(0);
             } catch (InputMismatchException e) {
                 System.out.println("Entrada no valida, vuelve a ingresar");
                 lc.nextLine();
             }
         } while (!entradaValida);
         return caracter;
    }
    
    // se puede hacer lo mismo que antes, o a chat no ponerle el try, catch por buena practca mejor le pones todo :v
    public String leerCadena (String mensaje) {
        System.out.println("Mensaje");
        return lc.nextLine();
    }
    
    public void cerrar() {
        lc.close();
    } 
 }
