import java.util.Scanner;
public class util {
    /**
     * MENSAJE DE TEXTO que le pide al usuario un numero aleatorio
     * @param msg
     * @return
     */
    public static int pedirNumeroUsuario(String msg) {

        Scanner sc = new Scanner(System.in);
        System.out.println(msg);

        int numeroUsuario = sc.nextInt();

        return numeroUsuario;
    }

    public static int pedirNumeroAleatorio() {

        int numeroAleatorio = (int) Math.round(Math.random()*10);
        return numeroAleatorio;
    }

    public static int pedirNumeroAleatorioEntreDosNumeros( int min, int max) {

        int numeroAleatorio = (int) Math.round(Math.random()*(max-min)+min);
        return numeroAleatorio;
    }

    public static void ordenarBurbuja(int[] array) {
        int n = array.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    // Intercambiar array[j] y array[j + 1]
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }



    public static void imprimirArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");

        }

    }

    public static int[] arraydeNumerosAleatorios (int tamayo) {
        int[] numeros = new int[tamayo];
        for (int i=0;i < numeros.length;i++) {
            numeros[i] = pedirNumeroAleatorioEntreDosNumeros(0, 100);
        }
        return numeros;
    }
    public static int[] arraydeNumerosAleatoriosUsuario (int min , int max) {
        int[] numeros = new int[150];
        for (int i=0;i < numeros.length;i++) {
            numeros[i] = pedirNumeroAleatorioEntreDosNumeros(min, max);
        }
        return numeros;
    }
    /**
     * Imprime una matriz bidimensional de enteros.
     * @param matriz La matriz a imprimir.
     */
    public static void imprimirMatriz(int[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println();
        }
    }

}








