
package tipodato;
public class TipoDato { 
    public static void main(String[] args) {
        
        //declarando 
        String Nombre;
        int Edad;
        boolean Estado;
        double Saldo;
        Object TodoTipoDato;
        
        //asignado
        Nombre = "Oscar Alberto Apaza Limache";
        Edad = 20;
        Saldo = 1000.34;
        TodoTipoDato = "Cadena";
        TodoTipoDato = 2;
        TodoTipoDato = true;
        TodoTipoDato = 23.34;
        
        
        // Print
        System.out.println(Nombre);
        System.out.println("Nombre: " + Nombre);
        System.out.println(Edad);
        System.out.println("Edad: " + Edad);
        System.out.println("Saldo: " + Saldo);
        System.out.println("Dinamico: " + TodoTipoDato);
    }
    
}
