package utils;

import java.util.Arrays;

import static utils.Util.pedirNumeroAleatorioEntreDosNumeros;

public class ArrayUtil {

	/**
	 * Imprime los elementos de un array en una sola línea.
	 *
	 * @param array Array de enteros a imprimir.
	 */
	public static void imprimirArray(int[] array) {
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
		System.out.println();
	}

	/**
	 * Llena un array con números aleatorios entre 0 y 100.
	 *
	 * @param array Array que se llenará con números aleatorios.
	 */
	public static void llenarArrayConAleatorios(int[] array) {
		for (int i = 0; i < array.length; i++) {
			array[i] = (int) (Math.random() * 101);
		}
	}

	/**
	 * Encuentra el valor máximo en un array.
	 *
	 * @param array Array de enteros.
	 * @return Valor máximo encontrado en el array.
	 */
	public static int encontrarMaximo(int[] array) {
		int max = array[0];
		for (int i = 1; i < array.length; i++) {
			if (array[i] > max) {
				max = array[i];
			}
		}
		return max;
	}

	/**
	 * Encuentra el valor mínimo en un array.
	 *
	 * @param array Array de enteros.
	 * @return Valor mínimo encontrado en el array.
	 */
	public static int encontrarMinimo(int[] array) {
		int min = array[0];
		for (int i = 1; i < array.length; i++) {
			if (array[i] < min) {
				min = array[i];
			}
		}
		return min;
	}

	/**
	 * Calcula la suma de todos los elementos de un array.
	 *
	 * @param array Array de enteros.
	 * @return Suma total de los elementos.
	 */
	public static int sumarElementos(int[] array) {
		int suma = 0;
		for (int i = 0; i < array.length; i++) {
			suma += array[i];
		}
		return suma;
	}

	/**
	 * Calcula el promedio de los elementos de un array.
	 *
	 * @param array Array de enteros.
	 * @return Promedio de los elementos.
	 */
	public static double calcularPromedio(int[] array) {
		return (double) sumarElementos(array) / array.length;
	}

	/**
	 * Verifica si un número existe en el array.
	 *
	 * @param array  Array de enteros.
	 * @param numero Número a buscar.
	 * @return True si el número existe, false en caso contrario.
	 */
	public static boolean contieneNumero(int[] array, int numero) {
		for (int i = 0; i < array.length; i++) {
			if (array[i] == numero) {
				return true;
			}
		}
		return false;
	}

	/**
	 * Copia un array en uno nuevo.
	 *
	 * @param array Array de enteros.
	 * @return Copia del array original.
	 */
	public static int[] copiarArray(int[] array) {
		int[] copia = new int[array.length];
		for (int i = 0; i < array.length; i++) {
			copia[i] = array[i];
		}
		return copia;
	}

	/**
	 * Ordena un array en orden ascendente usando el algoritmo de burbuja.
	 *
	 * @param array Array de enteros.
	 */
	public static void ordenarArrayAscendente(int[] array) {
		int n = array.length;
		for (int i = 0; i < n - 1; i++) {
			for (int j = 0; j < n - i - 1; j++) {
				if (array[j] > array[j + 1]) {
					int temp = array[j];
					array[j] = array[j + 1];
					array[j + 1] = temp;
				}
			}
		}
	}

	/**
	 * Ordena un array en orden descendente.
	 *
	 * @param array Array de enteros.
	 */
	public static void ordenarArrayDescendente(int[] array) {
		Arrays.sort(array);
		for (int i = 0; i < array.length / 2; i++) {
			int temp = array[i];
			array[i] = array[array.length - 1 - i];
			array[array.length - 1 - i] = temp;
		}
	}

	/**
	 * Invierte un array.
	 *
	 * @param array Array de enteros.
	 * @return Nuevo array invertido.
	 */
	public static int[] invertirArray(int[] array) {
		int[] invertido = new int[array.length];
		for (int i = 0; i < array.length; i++) {
			invertido[i] = array[array.length - 1 - i];
		}
		return invertido;
	}

	/**
	 * Elimina los elementos duplicados de un array.
	 *
	 * @param array Array original.
	 * @return Nuevo array sin duplicados.
	 */
	public static int[] eliminarDuplicados(int[] array) {
		return Arrays.stream(array).distinct().toArray();
	}

	/**
	 * Devuelve el índice de la primera aparición de un número en el array.
	 *
	 * @param array  Array de enteros.
	 * @param numero Número a buscar.
	 * @return Índice de la primera aparición, o -1 si no se encuentra.
	 */
	public static int buscarIndice(int[] array, int numero) {
		for (int i = 0; i < array.length; i++) {
			if (array[i] == numero) {
				return i;
			}
		}
		return -1;
	}

	/**
	 * Llena un array con un valor específico.
	 *
	 * @param array Array de enteros.
	 * @param valor Valor a asignar a cada elemento.
	 */
	public static void llenarArrayConValor(int[] array, int valor) {
		Arrays.fill(array, valor);
	}

	/**
	 * Cuenta cuántas veces aparece un número en el array.
	 *
	 * @param array  Array de enteros.
	 * @param numero Número a contar.
	 * @return Número de veces que aparece.
	 */
	public static int contarApariciones(int[] array, int numero) {
		int contador = 0;
		for (int i = 0; i < array.length; i++) {
			if (array[i] == numero) {
				contador++;
			}
		}
		return contador;
	}

	/**
	 * Combina dos arrays en uno nuevo.
	 *
	 * @param array1 Primer array.
	 * @param array2 Segundo array.
	 * @return Nuevo array combinado.
	 */
	public static int[] combinarArrays(int[] array1, int[] array2) {
		int[] combinado = new int[array1.length + array2.length];
		System.arraycopy(array1, 0, combinado, 0, array1.length);
		System.arraycopy(array2, 0, combinado, array1.length, array2.length);
		return combinado;
	}

	/**
	 * Busca el número más frecuente en el array.
	 *
	 * @param array Array de enteros.
	 * @return Número más frecuente.
	 */
	public static int numeroMasFrecuente(int[] array) {
		int maxFrecuencia = 0;
		int numeroFrecuente = array[0];
		for (int num : array) {
			int frecuencia = contarApariciones(array, num);
			if (frecuencia > maxFrecuencia) {
				maxFrecuencia = frecuencia;
				numeroFrecuente = num;
			}
		}
		return numeroFrecuente;
	}

	/**
	 * Convierte un array de enteros a una cadena de texto.
	 *
	 * @param array Array de enteros.
	 * @return Representación en cadena del array.
	 */
	public static String arrayToString(int[] array) {
		return Arrays.toString(array);
	}

	/**
	 * Genera un array de enteros con números aleatorios entre 0 y 100.
	 * El tamaño del array es especificado por el parámetro 'tamayo'.
	 *
	 * @param tamayo Tamaño del array que se desea generar.
	 * @return Un array de enteros con números aleatorios entre 0 y 100.
	 */
	public static int[] arraydeNumerosAleatorios(int tamayo) {
		int[] numeros = new int[tamayo];
		for (int i = 0; i < numeros.length; i++) {
			// Llama al método 'pedirNumeroAleatorioEntreDosNumeros(0, 100)' para generar un número aleatorio
			// entre 0 y 100 y asigna ese número a la posición 'i' del array 'numeros'.
			numeros[i] = pedirNumeroAleatorioEntreDosNumeros(0, 100);
		}
		return numeros;
	}

	/**
	 * Genera un array de enteros con 150 números aleatorios dentro de un rango especificado por el usuario.
	 * Los números aleatorios son generados entre los valores 'min' y 'max'.
	 *
	 * @param min Valor mínimo del rango.
	 * @param max Valor máximo del rango.
	 * @return Un array de enteros con 150 números aleatorios generados entre 'min' y 'max'.
	 */
	public static int[] arraydeNumerosAleatoriosUsuario(int min, int max) {
		int[] numeros = new int[150];
		for (int i = 0; i < numeros.length; i++) {
			// Llama al método 'pedirNumeroAleatorioEntreDosNumeros(min, max)' para generar un número aleatorio
			// entre 'min' y 'max' y asigna ese número a la posición 'i' del array 'numeros'.
			numeros[i] = pedirNumeroAleatorioEntreDosNumeros(min, max);
		}
		return numeros;
	}

	/**
	 * Ordena un array de enteros utilizando el algoritmo de ordenación por burbuja.
	 * En cada iteración, compara elementos adyacentes y los intercambia si están en el orden incorrecto.
	 *
	 * @param array El array de enteros que se desea ordenar.
	 */
	public static void ordenarBurbuja(int[] array) {
		int n = array.length;
		for (int i = 0; i < n - 1; i++) {
			for (int j = 0; j < n - i - 1; j++) {
				// Si el elemento en la posición 'j' es mayor que el elemento en la posición 'j+1',
				// los intercambia.
				if (array[j] > array[j + 1]) {
					int temp = array[j];
					array[j] = array[j + 1];
					array[j + 1] = temp;
				}
			}
		}
	}
}+
