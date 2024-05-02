/*package estructuradatos;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map; 

public class EstructuraDatos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean salir = false;
        while(!salir){
            System.out.println("Estructura de datos");
            System.out.println("1.- Array");
            System.out.println("2.- ArrayList");
            System.out.println("3.- HashMap");
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
                    
                case 3:
                    System.out.println("Bienvenido HashMap");
                    
                    Map<String,Integer> edades1 = new HashMap<>(); 
                    
                    //Insertando Data
                    edades1.put("Oscar",20);
                    edades1.put("Miqueas",12);
                    edades1.put("Juanca",60);
                    edades1.put("Jean Franco",50);
                    
                    //Eliminar un dato
                    edades1.remove("Jean Franco");
                    
                    //Recuperar un valor
                    System.out.println("Edad Oscar: "+ edades1.get("Oscar"));
                    
                    //Longitud del Mapa
                    edades1.size();
                    
                    //Imprimir las llaves (key)
                    for(String key : edades1.keySet()){
                        System.out.println("Llave: "+ key);
                        
                    }
                    
                    //Imprimir los valores (value)
                    for(Integer value : edades1.values()){
                        System.out.println("Valor: "+ value);
                    }
                    
                    //Imprimir las llaves y los valores
                    for(Map.Entry<String,Integer> lv : edades1.entrySet()){
                        System.out.println("llave: "+ lv.getKey() + " valor: "+ lv.getValue());
                    }
                    
                    
                    
                    break;
                    
                    
                default:
                    throw new AssertionError();
                        
            }
        }
        scanner.close();
    }
}*/


package estructuradatos;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class EstructuraDatos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean salir = false;
        
        while (!salir) {
            System.out.println("Estructura de datos");
            System.out.println("1.- Array");
            System.out.println("2.- ArrayList");
            System.out.println("3.- HashMap");
            System.out.println("4.- Salir");
            
            System.out.print("Ingrese una opcion: ");
            
            try {
                int opcion = scanner.nextInt();
                
                switch (opcion) {
                    case 1:
                        System.out.println("Bienvenido a la ED Array");
                        int[] edades = {12, 40, 30, 50, 7, 5, 60, 70, 100};
                        String[] nombres = {"Daniel", "Marcos", "Diego", "Ariel"};
                        
                        // Operaciones con arrays
                        System.out.println("Longitud edades: " + edades.length);
                        System.out.println("Longitud nombres: " + nombres.length);
                        
                        // edades[20] = 50;  // Esto podría lanzar una ArrayIndexOutOfBoundsException
                        
                        break;
                        
                    case 2:
                        System.out.println("Bienvenido a ArrayList");
                        ArrayList<String> listaNombres = new ArrayList<>();
                        listaNombres.add("David");
                        listaNombres.add("Marco");
                        listaNombres.add("Julio");
                        
                        // Operaciones con ArrayList
                        System.out.println("Tamaño Lista: " + listaNombres.size());
                        
                        // System.out.println("Elemento obtenido: " + listaNombres.get(10));  
                        
                        break;
                        
                    case 3:
                        System.out.println("Bienvenido a HashMap");
                        Map<String, Integer> edadesMap = new HashMap<>();
                        edadesMap.put("Oscar", 20);
                        edadesMap.put("Miqueas", 12);
                        edadesMap.put("Juanca", 60);
                        edadesMap.put("Jean Franco", 50);
                        
                        // Operaciones con HashMap
                        System.out.println("Edad Oscar: " + edadesMap.get("Oscar"));
                        
                        break;
                        
//                    case 4:
//                        salir = true;
//                        System.out.println("Saliendo...");
//                        break;
//                        
                    default:
                        System.out.println("Opción no válida. Por favor, ingrese una opción válida.");
                        break;
                }
            } catch (Exception e) {
                
                System.out.println("Ha ocurrido un error: " + e.getMessage());
                scanner.nextLine(); 
            } finally{
                System.out.println("Gracias por usar el programa");
            }
        }       
        
        
        scanner.close();
    }
}
