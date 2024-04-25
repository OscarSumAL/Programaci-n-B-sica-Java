package operadoresdecomparacion;
public class OperadoresDeComparacion {
    public static void main(String[] args) {
        int a = 10;
        int b = 5;
        int c = 10; 

        // Operadores de comparación
        boolean igualdad = (a == b);
        boolean desigualdad = (a != b);
        boolean mayorQue = (a > b);
        boolean menorQue = (a < b);
        boolean mayorIgualQue = (a >= c); 
        boolean menorIgualQue = (b <= c); 

        // Imprimir resultados de las comparaciones
        System.out.println("Igualdad (a == b): " + igualdad);          
        System.out.println("Desigualdad (a != b): " + desigualdad);     
        System.out.println("Mayor que (a > b): " + mayorQue);            
        System.out.println("Menor que (a < b): " + menorQue);            
        System.out.println("Mayor o igual que (a >= c): " + mayorIgualQue); 
        System.out.println("Menor o igual que (b <= c): " + menorIgualQue);     
    }
}
