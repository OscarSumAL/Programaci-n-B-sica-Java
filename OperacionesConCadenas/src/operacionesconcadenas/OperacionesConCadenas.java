package operacionesconcadenas;
public class OperacionesConCadenas {
    public static void main(String[] args) {
        String Nombres = "Oscar Alberto";
        String Apellidos = "Apaza Limache";
        
        //Concatenar
        String NombreCompleto = Nombres + " " + Apellidos;
        System.out.println("Nombre Completo: " + NombreCompleto);
        
        //Mayusculas
        String NombreCompleto1 = Nombres + " " + Apellidos;
        System.out.println("NombreCompleto: "+ NombreCompleto1.toUpperCase() );
        
        //Minusculas
        String NombreCompleto2 = Nombres + " " + Apellidos;
        System.out.println("NombreCompleto: "+ NombreCompleto2.toLowerCase() );
        
        //Contar cadenas
         String NombreCompleto3 = Nombres + " " + Apellidos;
         System.out.println("Cantidad de Caracteres: " + NombreCompleto3.length());
         
        //Cortar una cadena
        String NombreCompleto4 = Nombres + " " + Apellidos;
        String[] NombreCortado = NombreCompleto4.split(" ");
        
        for(int i = 0 ; i < NombreCortado.length ; i++){
            System.out.println(NombreCortado[i]);
        }
        
        /*for(String nombre : NombreCortado){
            System.out.println();
        }
        
        /*System.out.println("Nombre Cortado:");
                for (String parte : NombreCortado){
                    System.out.println(parte);
                }*/
        
        //Equals 
        boolean  comparacion = Nombres.equals(Apellidos);
        boolean  comparacion2 = Nombres == Apellidos;
        System.out.println("Comparacion: "+ comparacion);
        System.out.println("Comparacion2: "+ comparacion2);
        
        //Interpolacion de variables
        String n = "Oscar";
        String a = "Apellido";
        int e = 50;
        
        String mensaje = String.format("Mi nombre es %s, mi apellido es %s y tengo %d años", n, a, e);
        System.out.println(mensaje);
    }
    
}
