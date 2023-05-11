
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
