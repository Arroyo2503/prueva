package array.ejercicio;

import utils.ArrayUtil;

public class Ejercicio3 {
    public static void main(String[] args) {
        // Inicializar el array con números aleatorios
    	int[] numeros = ArrayUtil.arraydeNumerosAleatorios(5);

        // Mostrar el array antes de ordenar
        System.out.println("Array antes de ordenar:");
        ArrayUtil.imprimirArray(numeros);

        // Ordenar el array usando el algoritmo de Burbuja
        ArrayUtil.ordenarBurbuja(numeros);
        
        //separacioin de los array por un espacio
        System.out.println();
        
        // Mostrar el array después de ordenar
        System.out.println("Array después de ordenar:");
        ArrayUtil.imprimirArray(numeros);
    }
}

	


