package lam.conciliaciones;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PruebasTest {

	@Test
	@DisplayName("Obtener el calificativo para el arreglo (PAR O IMPAR) y retornar numero que no pertenezca al grupo.")
	void nombrarArreglo() {
		int[] numerosPares = new int[]{ 2, 4, 6, 8, 10,3};
		int[] numerosPares1 = new int[]{ 2, 4, 6, 7,8, 10};
		int[] numerosImpares = new int[]{6, 1, 3, 5, 7, 9};
		int[] numerosImpares1 = new int[]{1, 3, 5, 7, 9,6};
		int[] numerosImpares2 = new int[]{ 1, 3, 5,6, 7, 9};

		assertEquals("PAR,3", Pruebas.nombrarArreglo(numerosPares));
		assertEquals("PAR,7", Pruebas.nombrarArreglo(numerosPares1));
		assertEquals("IMPAR,6", Pruebas.nombrarArreglo(numerosImpares));
		assertEquals("IMPAR,6", Pruebas.nombrarArreglo(numerosImpares1));
		assertEquals("IMPAR,6", Pruebas.nombrarArreglo(numerosImpares2));


//mi solucion 


package ejer1;

public class Ejer1 {
    public static void main(String[] args) {
        
        
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

	}

	@Test
	@DisplayName("Ordenar en descendente los números impares y dejar los pares en su posición original")
	void ordernarImpares() {
		assertArrayEquals(new int[]{1, 3, 2, 8, 5, 4}, Pruebas.ordernarImpares(new int[]{5, 3, 2, 8, 1, 4}));
		assertArrayEquals(new int[]{1, 3, 5, 8, 0}, Pruebas.ordernarImpares(new int[]{5, 3, 1, 8, 0}));
		assertArrayEquals(new int[]{}, Pruebas.ordernarImpares(new int[]{}));

//mi solucion 
 
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
 
	}

	@Test
	@DisplayName("Regresar siete o cuatro")
	void cuatroOSiete() {
		assertEquals(Pruebas.cuatroOSiete(7), 4);
		assertEquals(Pruebas.cuatroOSiete(4), 7);
		assertEquals(Pruebas.cuatroOSiete(20), 0);
		assertEquals(Pruebas.cuatroOSiete(3), 0);


/*
//solucion en pseudo
Inicio
    crear variables 
    random = nuevo Random()
    crear un numero entre 1 y 2 
    numeroAleatorio = random.generarEnteroEntre(1, 2)
    comprobar el numero a salir 
    si numeroAleatorio es igual a 1
 	Mostrar "El número aleatorio es 4."
    sino
    Mostrar "El número aleatorio es 7."
Fin
*/
	}

	@Test
	@DisplayName("Calcular tiempo cola supermercado")
	void tiempoSupemercado() {
		assertEquals(9, Pruebas.tiempoSupemercado(new int[]{2, 2, 3, 3, 4, 4}, 2));
		assertEquals(0, Pruebas.tiempoSupemercado(new int[]{}, 1));
		assertEquals(15, Pruebas.tiempoSupemercado(new int[]{1, 2, 3, 4, 5}, 1));




		public class TiempoFila {
			public static void main(String[] args) {
				int[] tiempos = {2, 2, 3, 3, 4, 4};
				int tiempoTotal = calcularTiempoTotal(tiempos);     
		  
				int totalTiempo = 0;
				for (int i = 0; i < tiempos.length; i++) {
					totalTiempo += tiempos[i];
				}
				return totalTiempo;
				System.out.println("El tiempo total que los clientes han pasado en la fila es: " + tiempoTotal);
		}
		}





	}

	@Test
	@DisplayName("Sumar número a cadena")
	void sumarNumeroCadena() {
		assertEquals (Pruebas.sumarNumeroCadena("foobar000"), "foobar001");
		assertEquals (Pruebas.sumarNumeroCadena("foo"), "foo1");
		assertEquals (Pruebas.sumarNumeroCadena("foobar001"), "foobar002");
		assertEquals(Pruebas.sumarNumeroCadena("foobar99"), "foobar100");
		assertEquals(Pruebas.sumarNumeroCadena("foobar099"), "foobar100");
		assertEquals(Pruebas.sumarNumeroCadena(""), "1");



		package letrasumar;


		public class Letrasumar {
		
		   
			public static void main(String[] args) { 
			 for (int i = 0; i <= 100; i++) {
			String letra = "";
			if (i < 10) {
				letra = "00" + i;
			} else if (i < 100) {
				letra = "0" + i;
			} else {
				letra = "" + i;
			}
			String resultado = "foobar" + letra;
			System.out.println(resultado);
		}       
			}  
		}



	}

	@Test
	@DisplayName("Buscar la palabra o palabras más cortas")
	void palabraMasCorta() {
		assertEquals(3, Pruebas.palabraMasCorta("bitcoin take over the world maybe who knows perhaps"));
		assertEquals(3, Pruebas.palabraMasCorta("turns out random test cases are easier than writing out basic ones"));
		assertEquals(2, Pruebas.palabraMasCorta("Let's travel abroad shall we"));



/*

 inico
 Definir una variable "palabra_mas_corta"
 Definir una variable "palabra_actual"para almacenar la frase.
 Recorrer cada carácter de la cadena de texto, empezando por el primer carácter:
       Comparar la longitud de "palabra_actual" con la "longitud_palabra_mas_corta"
         Si "palabra_actual" es más corta, entonces
          Asignar "palabra_actual" a "palabra_mas_corta"
          Asignar la longitud de "palabra_actual" a "longitud_palabra_mas_corta"
 Añadir el carácter actual a "palabra_actual"
Al final del recorrido, comparar la longitud de "palabra_actual" con la "longitud_palabra_mas_corta"
Si "palabra_actual" es más corta, entonces 
Devolver la variable "palabra_mas_corta"
Mostrar la "palabra_mas_corta"
FIN
*/



	}
}