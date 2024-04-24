package operadoresaritmeticos;
public class OperadoresAritmeticos {
    public static void main(String[] args) {
        int variableUno = 50;
        int variableDos = 20;
        
        //incremento
        //variableUno = variableUno + 1;
        variableUno++;
        System.out.println("Incremento: "+ variableUno);
        
        //Decremento
        variableDos = variableDos - 1;
        variableDos--;
        System.out.println("Dremento :" + variableDos);
        
        //resultado suma
        int suma = variableUno + variableDos;
        System.out.println("Suma: "+ suma);
        
         // Resultado resta
        int resta = variableUno - variableDos;
        System.out.println("Resta: " + resta);
        
        // Resultado multiplicación
        int multiplicacion = variableUno * variableDos;
        System.out.println("Multiplicacion: " + multiplicacion);
        
        // Resultado División
        double division = (double) variableUno / variableDos;
        System.out.println("Division: " + division);
        
        // Resultado módulo
        double modulo = variableUno % variableDos;
        System.out.println("Modulo: " + modulo);
        
        
    }
    
}
