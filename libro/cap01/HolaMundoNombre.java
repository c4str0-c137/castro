package libro.cap01;
import java.util.Scanner;
public class HolaMundoNombre{
    public static void main(String [] args){
        // permite leer datos por teclado
        Scanner scanner = new Scanner(System.in);
        
        //mensaje para el usuario
        System.out.print("Ingrese su nombre: ");
        
        //leemos un valor entero por teclado
        String nom= scanner.nextLine();
        
        // mostrar un mensaje y luego el valor leido
        System.out.println("Hola Mundo: " + nom);
    }
}
