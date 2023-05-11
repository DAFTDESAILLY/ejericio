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