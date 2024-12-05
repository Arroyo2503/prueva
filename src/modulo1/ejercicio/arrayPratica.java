package modulo1.ejercicio;

import utils.ArrayUtil;
import utils.Util;

import java.util.Scanner;

public class arrayPratica {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

//        int tamaño = Util.pedirNumeroUsuario(" dame el tamaño del Array: ");
//
//        int[] numeros = new int[tamaño];
//
//        for(int i = 0; i < tamaño ; i++) {
//            System.out.println("ingresa el valor para la posicion " + i + " :");
//            numeros[i] = scanner.nextInt();
//        }
//        System.out.println("Los valores en el array son: ");
//        for(int i = 0; i < tamaño ; i++){
//            System.out.println(numeros[i] + " " );
//        }

        int tamaño = Util.pedirNumeroUsuario(" dame el tamaño del Array: ");
        int[] numeros = new int[tamaño];

        for(int i = 0; i < tamaño ; i++) {
            System.out.println("ingresa el valor para la posicion " + i + " :");
            numeros[i] = scanner.nextInt();
        }
        int mayor = numeros[0];
        for(int i = 1; i < tamaño ; i++) {
            numeros[i] = scanner.nextInt();
            if (numeros[i] > mayor) {
                mayor = numeros[i];

            }
        }

        System.out.println("el numero mayor del array es " + mayor);

    }


}
