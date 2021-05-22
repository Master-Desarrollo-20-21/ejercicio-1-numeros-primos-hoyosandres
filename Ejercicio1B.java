public class Ejercicio1B {
    final static int TOTAL_PRIMOS = 50;
    public static void main(String args[]) {
      int suma = 0;
      int c = 0;
      int numero = 0;
      while(c<TOTAL_PRIMOS){
        numero++;
        int div = numero /2;
        while(div>1 && (numero % div)!=0){
            div--;
        }
        if(div<=1){
            c++;
            suma+=numero;
        }
        
      }
      System.out.println("Suma de los primeros 50 numeros primos = " + suma);
      System.out.println("Ultimo numero primo " + numero);
    }
}
