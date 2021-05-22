public class Ejercicio1A {
    final static int PRIMOS_MENORES_A = 50;
    public static void main(String args[]) {
      int suma = 0;
      int ultimoPrimo = 0;
      for(int i = 1; i<=PRIMOS_MENORES_A; i++){
        int div = i /2;
        while(div>1 && (i % div)!=0){
            div--;
        }
        if(div<=1){
            suma+=i;
            ultimoPrimo = i;
        }
        
      }
      System.out.println("Suma de todos los numeros primos entre (0..50) = " + suma);
      System.out.println("Ultimo numero primo " + ultimoPrimo);
    }
}
