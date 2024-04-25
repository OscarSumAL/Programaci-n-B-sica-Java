package estructuradatos;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Arrays;

import java.util.ArrayList;

public class EstructuraDatos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean salir = false;
        while(!salir){
            System.out.println("Estructura de datos");
            System.out.println("1.- Array");
            System.out.println("2.- ArrayList");
            System.out.println("3.- HasMap");
            System.out.println("4.- Salir");
            
            System.out.print("Ingrese una opcion: ");
            int opcion = scanner.nextInt();
            
            switch (opcion) {
                case 1:
                    System.out.println("Bienvenido a la ED Array");
                    int[] edades = {12, 40, 30, 50, 7, 5, 60, 70, 100};
                    String[] nombres = {"Daniel", "Marcos", "Diego", "Ariel"};
                    
                    //Longitud del array
                    System.out.println("Longitud edades: "+ edades.length);
                    System.out.println("Longitud nombres: "+ nombres.length);
                    
                    //Cambiar un valor
                    edades[1] = 38;
                    nombres[3] = "David";
                    System.out.println("Nuevo array edades: "+ edades[1]);
                    System.out.println("Nuevo Dato: "+ nombres[3]);
                    
                    //Convertir un array a String
                    System.out.println(Arrays.toString(edades));
                    System.out.println(Arrays.toString(nombres));
                    
                    //Clonar
                    int[] edadesClon = edades.clone();
                    System.out.println("Array clonado: " + Arrays.toString(edadesClon));
                    break;
                    
                case 2:
                    System.out.println("Bienvenido a ArrayList");
                    ArrayList<String> ListaNombres = new ArrayList<>();
                    
                    //Agregar datos
                    ListaNombres.add("David");
                    ListaNombres.add("Marco");
                    ListaNombres.add("Julio");
                    
                    //Longitud de la lista
                    System.out.println("Tamaño Lista: " + ListaNombres.size());
                    
                    //Remover un elemento de la lista
                    ListaNombres.remove(2);
                    
                    //Obtener un elemento de la lista
                    System.out.println("Elemento obtenido: "+ ListaNombres.get(1));
                    
                    //comprobar si la lista está vacia
                    System.out.println("Lista vacia?: "+ ListaNombres.isEmpty());
                    
                    //comprobar si un elemento existe
                    System.out.println("Existe: "+ ListaNombres.contains("David"));
                    
                    break;
                default:
                    throw new AssertionError();
            }
            
            
        }
        scanner.close();
    }
    
}
