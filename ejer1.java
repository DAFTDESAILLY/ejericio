import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {

        int[] numeros ={ 2, 4, 6, 8, 10,3};
     // int[] numeros =[]{ 2, 4, 6, 7,8, 10};
	//	int[] numeros =[]{6, 1, 3, 5, 7, 9};
	//	int[]numeros =[]{1, 3, 5, 7, 9,6};
	//	int[]numeros ={ 1, 3, 5,6, 7, 9};// arreglo de números
        
        System.out.println("Números pares:");
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] % 2 == 0) { 
                System.out.println(numeros[i]);
            }
        }
        
        System.out.println("Números impares:");
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] % 2 != 0) { 
                System.out.println(numeros[i]);
            }
        }
    }
}



