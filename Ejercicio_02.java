public class Ejercicio_02{
  
    public static void main(String[] args) {
        int[] numeros = {1, 2, 3, 4, 5};
        int punto = 2;
        int[] resultado = rotarArregloIzquierda(numeros, punto);
        
        for (int i = 0; i < numeros.length; i++) {
        System.out.println((resultado[i]));
        }
    }

    public static int[] rotarArregloIzquierda(int[] arreglo, int punto) {
        int longitud = arreglo.length;
        int[] resultado = new int[longitud];

        for (int i = 0; i < longitud; i++) {
            int nuevaPosicion = (i - punto + longitud) % longitud;
            resultado[nuevaPosicion] = arreglo[i];
        }

        return resultado;
    }
}
   
    
