/*package ciclowhile; 
import java.util.Scanner;
public class CicloWhile {
    public static void main(String[] args) {
        boolean salir = false;  
        Scanner scanner = new Scanner(System.in);
        int opcion;

        while (!salir) {
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
                    int[] numeros = {1, 2, 3, 4, 5};
                    Object[] numerosLetras = {12, "Oscar", 123.21, true, "Micke"};
                    for (Object nl : numerosLetras){
                        System.out.println(nl);
                        
                    System.out.println("Números y letras:");
                    for (int i = 0; i < numerosLetras.length; i++) {
                        System.out.println(numerosLetras[i]);
                    }
                    
                    }
                    salir = true;
                    
                    
                    
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
                    salir = true;  
                    break;
                default:
                    System.out.println("Ingrese una opción válida.");
                    break;
            }
        }

        scanner.close(); 
    }
}



import java.util.Scanner;

public class CicloWhile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean salir = false;

        while (!salir) {
            System.out.println("=========================");
            System.out.println("Bienvenido a ... ");
            System.out.println("1.- Saludar");
            System.out.println("2.- Mostrar números y letras");
            System.out.println("3.- Cobrar");
            System.out.println("4.- Escapar");
            System.out.println("5.- Salir");
            System.out.println("=========================");

            System.out.print("Ingrese su opción: ");
            int opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("¡Buenos días!");
                    break;
                case 2:
                    int[] numeros = {1, 2, 3, 4, 5};
                    Object[] numerosLetras = {12, "Oscar", 123.21, true, "Micke"};

                    System.out.println("Números y letras:");
                    for (Object nl : numerosLetras) {
                        System.out.println(nl);
                    }

                    boolean encontrado = false;
                    for (int numero : numeros) {
                        if (numero == 2) {
                            System.out.println("Se ha encontrado el número 2.");
                            encontrado = true;
                            break;
                        }
                    }
                    if (!encontrado) {
                        System.out.println("No se ha encontrado el número 2.");
                    }
                    break;
                case 3:
                    System.out.println("Cobrando ...");
                    break;
                case 4:
                    System.out.println("¡Se escapó!");
                    break;
                case 5:
                    System.out.println("Gracias por usar nuestro menú.");
                    salir = true;
                    break;
                default:
                    System.out.println("Ingrese una opción válida.");
                    break;
            }
        }

        scanner.close();
    }
}*/

import java.util.Scanner;

public class CicloWhile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean salir = false;

        while (!salir) {
            System.out.println("=========================");
            System.out.println("Bienvenido a ... ");
            System.out.println("1.- Saludar");
            System.out.println("2.- Mostrar números");
            System.out.println("3.- Cobrar");
            System.out.println("4.- Escapar");
            System.out.println("5.- Salir");
            System.out.println("=========================");

            System.out.print("Ingrese su opción: ");
            int opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("¡Buenos días!");
                    break;
                case 2:
                    int[] numeros = {1, 2, 3, 4, 5};
                    System.out.println("Números:");
                    boolean encontrado = false;
                    for (int numero : numeros) {
                        System.out.println(numero);
                        if (numero == 2) {
                            encontrado = true;
                        }
                    }
                    if (encontrado) {
                        System.out.println("Se ha encontrado el número 2.");
                    } else {
                        System.out.println("No se ha encontrado el número 2.");
                    }
                    break;
                case 3:
                    System.out.println("Cobrando ...");
                    break;
                case 4:
                    System.out.println("¡Se escapó!");
                    break;
                case 5:
                    System.out.println("Gracias por usar nuestro menú.");
                    salir = true;
                    break;
                default:
                    System.out.println("Ingrese una opción válida.");
                    break;
            }
        }

        scanner.close();
    }
}
