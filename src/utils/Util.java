package utils;

import java.util.Scanner;

public class Util {

        /**
         * Pide un número al usuario.
         * @param msg Mensaje que se mostrará al usuario.
         * @return Número ingresado por el usuario.
         */
        public static int pedirNumeroUsuario(String msg) {
            Scanner sc = new Scanner(System.in);
            System.out.println(msg);
            return sc.nextInt();
        }

        /**
         * Pide un número decimal al usuario.
         * @param msg Mensaje que se mostrará al usuario.
         * @return Número decimal ingresado por el usuario.
         */
        public static double pedirNumeroDecimalUsuario(String msg) {
            Scanner sc = new Scanner(System.in);
            System.out.println(msg);
            return sc.nextDouble();
        }

        /**
         * Genera un número aleatorio entre 0 y 10.
         * @return Número aleatorio generado.
         */
        public static int pedirNumeroAleatorio() {
            return (int) (Math.random() * 11);
        }

        /**
         * Genera un número aleatorio entre dos valores dados.
         * @param min Valor mínimo.
         * @param max Valor máximo.
         * @return Número aleatorio generado entre min y max.
         */
        public static int pedirNumeroAleatorioEntreDosNumeros(int min, int max) {
            return (int) (Math.random() * (max - min + 1) + min);
        }

        /**
         * Verifica si un número es par.
         * @param numero Número a verificar.
         * @return True si el número es par, false si es impar.
         */
        public static boolean esPar(int numero) {
            return numero % 2 == 0;
        }

        /**
         * Verifica si un número es impar.
         * @param numero Número a verificar.
         * @return True si el número es impar, false si es par.
         */
        public static boolean esImpar(int numero) {
            return numero % 2 != 0;
        }

        /**
         * Calcula el factorial de un número.
         * @param numero Número del cual se calculará el factorial.
         * @return Factorial del número.
         */
        public static int calcularFactorial(int numero) {
            int factorial = 1;
            for (int i = 1; i <= numero; i++) {
                factorial *= i;
            }
            return factorial;
        }

        /**
         * Verifica si un número es primo.
         * @param numero Número a verificar.
         * @return True si el número es primo, false si no lo es.
         */
        public static boolean esPrimo(int numero) {
            if (numero <= 1) {
                return false;
            }
            for (int i = 2; i <= Math.sqrt(numero); i++) {
                if (numero % i == 0) {
                    return false;
                }
            }
            return true;
        }

        /**
         * Calcula el máximo común divisor (MCD) de dos números.
         * @param a Primer número.
         * @param b Segundo número.
         * @return MCD de a y b.
         */
        public static int calcularMCD(int a, int b) {
            while (b != 0) {
                int temp = b;
                b = a % b;
                a = temp;
            }
            return a;
        }

        /**
         * Calcula el mínimo común múltiplo (MCM) de dos números.
         * @param a Primer número.
         * @param b Segundo número.
         * @return MCM de a y b.
         */
        public static int calcularMCM(int a, int b) {
            return (a * b) / calcularMCD(a, b);
        }

        /**
         * Verifica si un número es positivo.
         * @param numero Número a verificar.
         * @return True si es positivo, false si es negativo o cero.
         */
        public static boolean esPositivo(int numero) {
            return numero > 0;
        }

        /**
         * Verifica si un número es negativo.
         * @param numero Número a verificar.
         * @return True si es negativo, false si es positivo o cero.
         */
        public static boolean esNegativo(int numero) {
            return numero < 0;
        }

        /**
         * Devuelve la suma de dos números enteros.
         * @param a Primer número.
         * @param b Segundo número.
         * @return Suma de a y b.
         */
        public static int sumar(int a, int b) {
            return a + b;
        }

        /**
         * Devuelve la resta de dos números enteros.
         * @param a Primer número.
         * @param b Segundo número.
         * @return Resta de a y b.
         */
        public static int restar(int a, int b) {
            return a - b;
        }

        /**
         * Devuelve el resultado de multiplicar dos números enteros.
         * @param a Primer número.
         * @param b Segundo número.
         * @return Producto de a y b.
         */
        public static int multiplicar(int a, int b) {
            return a * b;
        }

        /**
         * Devuelve el resultado de dividir dos números enteros.
         * @param a Dividendo.
         * @param b Divisor.
         * @return Cociente de a dividido entre b.
         */
        public static double dividir(int a, int b) {
            if (b != 0) {
                return (double) a / b;
            } else {
                System.out.println("Error: División por cero.");
                return 0;
            }
        }

        /**
         * Verifica si un carácter es una letra.
         * @param c Carácter a verificar.
         * @return True si es letra, false si no lo es.
         */
        public static boolean esLetra(char c) {
            return Character.isLetter(c);
        }

        /**
         * Verifica si un carácter es un dígito.
         * @param c Carácter a verificar.
         * @return True si es dígito, false si no lo es.
         */
        public static boolean esDigito(char c) {
            return Character.isDigit(c);
        }

        /**
         * Imprime una línea separadora.
         */
        public static void imprimirSeparador() {
            System.out.println("----------------------------");
        }

        /**
         * Convierte un número entero a binario.
         * @param numero Número a convertir.
         * @return Cadena con la representación binaria.
         */
        public static String convertirABinario(int numero) {
            return Integer.toBinaryString(numero);
        }
    }



