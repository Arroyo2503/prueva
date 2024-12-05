package utils;

public class MatrizUtil {

    /**
     * Imprime una matriz bidimensional de enteros.
     * @param matriz Matriz a imprimir.
     */
    public static void imprimirMatriz(int[][] matriz) {
        int filas = matriz.length;
        int columnas = matriz[0].length;
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println();
        }
    }

    /**
     * Llena una matriz con números aleatorios entre 0 y 100.
     * @param matriz Matriz que se llenará con números aleatorios.
     */
    public static void llenarMatrizConAleatorios(int[][] matriz) {
        int filas = matriz.length;
        int columnas = matriz[0].length;
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                matriz[i][j] = (int) (Math.random() * 101);
            }
        }
    }

    /**
     * Encuentra el valor máximo en una matriz.
     * @param matriz Matriz de enteros.
     * @return Valor máximo encontrado en la matriz.
     */
    public static int encontrarMaximo(int[][] matriz) {
        int max = matriz[0][0];
        int filas = matriz.length;
        int columnas = matriz[0].length;
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                if (matriz[i][j] > max) {
                    max = matriz[i][j];
                }
            }
        }
        return max;
    }

    /**
     * Encuentra el valor mínimo en una matriz.
     * @param matriz Matriz de enteros.
     * @return Valor mínimo encontrado en la matriz.
     */
    public static int encontrarMinimo(int[][] matriz) {
        int min = matriz[0][0];
        int filas = matriz.length;
        int columnas = matriz[0].length;
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                if (matriz[i][j] < min) {
                    min = matriz[i][j];
                }
            }
        }
        return min;
    }

    /**
     * Suma todos los elementos de una matriz.
     * @param matriz Matriz de enteros.
     * @return Suma total de los elementos.
     */
    public static int sumarElementos(int[][] matriz) {
        int suma = 0;
        int filas = matriz.length;
        int columnas = matriz[0].length;
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                suma += matriz[i][j];
            }
        }
        return suma;
    }

    /**
     * Calcula el promedio de los elementos de una matriz.
     * @param matriz Matriz de enteros.
     * @return Promedio de los elementos.
     */
    public static double calcularPromedio(int[][] matriz) {
        int suma = sumarElementos(matriz);
        int elementos = matriz.length * matriz[0].length;
        return (double) suma / elementos;
    }

    /**
     * Busca si un número existe en la matriz.
     * @param matriz Matriz de enteros.
     * @param numero Número a buscar.
     * @return True si el número existe, false en caso contrario.
     */
    public static boolean contieneNumero(int[][] matriz, int numero) {
        int filas = matriz.length;
        int columnas = matriz[0].length;
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                if (matriz[i][j] == numero) {
                    return true;
                }
            }
        }
        return false;
    }

    /**
     * Transpone una matriz (intercambia filas por columnas).
     * @param matriz Matriz original.
     * @return Matriz transpuesta.
     */
    public static int[][] transponerMatriz(int[][] matriz) {
        int filas = matriz.length;
        int columnas = matriz[0].length;
        int[][] transpuesta = new int[columnas][filas];
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                transpuesta[j][i] = matriz[i][j];
            }
        }
        return transpuesta;
    }

    /**
     * Multiplica dos matrices.
     * @param matriz1 Primera matriz.
     * @param matriz2 Segunda matriz.
     * @return Matriz resultante de la multiplicación.
     */
    public static int[][] multiplicarMatrices(int[][] matriz1, int[][] matriz2) {
        int filas1 = matriz1.length;
        int columnas1 = matriz1[0].length;
        int columnas2 = matriz2[0].length;
        int[][] resultado = new int[filas1][columnas2];

        for (int i = 0; i < filas1; i++) {
            for (int j = 0; j < columnas2; j++) {
                for (int k = 0; k < columnas1; k++) {
                    resultado[i][j] += matriz1[i][k] * matriz2[k][j];
                }
            }
        }
        return resultado;
    }

    /**
     * Verifica si dos matrices son iguales.
     * @param matriz1 Primera matriz.
     * @param matriz2 Segunda matriz.
     * @return True si son iguales, false en caso contrario.
     */
    public static boolean matricesIguales(int[][] matriz1, int[][] matriz2) {
        if (matriz1.length != matriz2.length || matriz1[0].length != matriz2[0].length) {
            return false;
        }

        for (int i = 0; i < matriz1.length; i++) {
            for (int j = 0; j < matriz1[i].length; j++) {
                if (matriz1[i][j] != matriz2[i][j]) {
                    return false;
                }
            }
        }
        return true;
    }

    /**
     * Convierte una matriz en una cadena de texto.
     * @param matriz Matriz a convertir.
     * @return Cadena que representa la matriz.
     */
    public static String matrizToString(int[][] matriz) {
        StringBuilder sb = new StringBuilder();
        int filas = matriz.length;
        int columnas = matriz[0].length;
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                sb.append(matriz[i][j]).append("\t");
            }
            sb.append("\n");
        }
        return sb.toString();
    }

    /**
     * Llena una matriz con un valor específico.
     * @param matriz Matriz de enteros.
     * @param valor Valor a asignar a cada posición.
     */
    public static void llenarMatrizConValor(int[][] matriz, int valor) {
        int filas = matriz.length;
        int columnas = matriz[0].length;
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                matriz[i][j] = valor;
            }
        }
    }

    /**
     * Suma dos matrices.
     * @param matriz1 Primera matriz.
     * @param matriz2 Segunda matriz.
     * @return Matriz resultante de la suma.
     */
    public static int[][] sumarMatrices(int[][] matriz1, int[][] matriz2) {
        int filas = matriz1.length;
        int columnas = matriz1[0].length;
        int[][] resultado = new int[filas][columnas];

        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                resultado[i][j] = matriz1[i][j] + matriz2[i][j];
            }
        }
        return resultado;
    }

    /**
     * Calcula la diagonal principal de una matriz cuadrada.
     * @param matriz Matriz cuadrada.
     * @return Array con los elementos de la diagonal principal.
     */
    public static int[] diagonalPrincipal(int[][] matriz) {
        int n = matriz.length;
        int[] diagonal = new int[n];
        for (int i = 0; i < n; i++) {
            diagonal[i] = matriz[i][i];
        }
        return diagonal;
    }

    /**
     * Calcula la diagonal secundaria de una matriz cuadrada.
     * @param matriz Matriz cuadrada.
     * @return Array con los elementos de la diagonal secundaria.
     */
    public static int[] diagonalSecundaria(int[][] matriz) {
        int n = matriz.length;
        int[] diagonal = new int[n];
        for (int i = 0; i < n; i++) {
            diagonal[i] = matriz[i][n - 1 - i];
        }
        return diagonal;
    }
}
