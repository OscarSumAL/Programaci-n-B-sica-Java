/*package switchcase;
import java.util.Scanner;

public class SwitchCase {
    public static void main(String[] args) {
        System.out.println("=========================");
        System.out.println("Bienvenido a ..... ");
        System.out.println("1.- Saludar");
        System.out.println("2.- Despedirse");
        System.out.println("3.- Cobrar");
        System.out.println("4.- Escapar");
        System.out.println("5.- Salir");
        System.out.println("=========================");
        
        Scanner scanner = new Scanner(System.in);
        int opcion = scanner.nextInt(); 
        
        
        
        switch (opcion) {
            case 1:
                System.out.println("Buenos dias");
                break;
            case 2:
                System.out.println("Chauuuu, ¡hasta luego!");
                break;
            case 3:
                System.out.println("Cobrando ...");
                break;
            case 4:
                System.out.println("Se escapó ...");
                break;
            case 5:
                System.out.println("Gracias por usar nuestro menu ...");
                break;
            default:
                throw new AssertionError("Ingrese una opción inválida: " + opcion);
                
        }      
    }
}*/


package switchcase;
import java.util.Scanner;

public class SwitchCase {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcion;

        // Bucle principal para mostrar el menú y procesar las opciones del usuario
        while (true) {
            System.out.println("=========================");
            System.out.println("Bienvenido a ..... ");
            System.out.println("1.- Saludar");
            System.out.println("2.- Despedirse");
            System.out.println("3.- Cobrar");
            System.out.println("4.- Escapar");
            System.out.println("5.- Salir");
            System.out.println("=========================");

            System.out.print("Ingrese su opción: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("Buenos días");
                    break;
                case 2:
                    System.out.println("Chauuuu, ¡hasta luego!");
                    break;
                case 3:
                    System.out.println("Cobrando ...");
                    break;
                case 4:
                    System.out.println("Se escapó ...");
                    break;
                case 5:
                    System.out.println("Gracias por usar nuestro menú.");
                    // Salir del bucle y terminar el programa
                    scanner.close(); // Cerrar el Scanner antes de salir
                    return;
                default:
                    System.out.println("Ingrese una opción válida.");
                    break;
            }
          
        scanner.close();    
        }
        //OSCAR ALBERTO APAZA LIMACHE
    }
}
