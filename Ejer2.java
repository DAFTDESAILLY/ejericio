
package ejer2;
public class Ejer2 {
    public static void main(String[] args) {
  //  int[] arreglo = {1, 3, 2, 8, 5, 4};
    int[] arreglo = {1, 3, 5, 8, 0};
    for (int i = 0; i < arreglo.length; i++) {
      if (arreglo[i] % 2 != 0) {
        for (int j = i + 1; j < arreglo.length; j++) {
          if (arreglo[j] % 2 != 0 && arreglo[i] < arreglo[j]) {
            int a = arreglo[i];
            arreglo[i] = arreglo[j];
            arreglo[j] = a;
          }
        }
      }
    }
    for (int i = 0; i < arreglo.length; i++) {
      System.out.print(arreglo[i] + " ");
    }   
    }   
}
