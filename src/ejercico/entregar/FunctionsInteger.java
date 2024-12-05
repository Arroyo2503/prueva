package ejercico.entregar;

import java.util.Scanner;

import utils.ArrayUtil;
import utils.Util;

public class FunctionsInteger {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		/**
		 * boolean para saber cuando terminar el while
		 */
		boolean fin = true;
		/**
		 * bucle while para que el usuario pueda elegir
		 * la opcion asta que eliga la opcion salir
		 */
		while (fin) {
			System.out.println("¡Menu de biblioteca!");
			System.out.println("1.Capicua");
			System.out.println("2.Primo");
			System.out.println("3.Contador de digitos");
			System.out.println("4.invertir cifra");
			System.out.println("5.Obtener el dígito en posición N");
			System.out.println("6.Encontrar posición del dígito");
			System.out.println("7.Eliminar dígitos desde el final");
			System.out.println("8.Agregar digito al final");
			System.out.println("9.obtener fragmento de numeros");
			System.out.println("10.unir dos numeros");
			System.out.println("11.salir");

			int opcion = scanner.nextInt();

			switch (opcion) {
				case 1: {
					capicua();
					break;
				}
				case 2: {
					primo();
					break;
				}
				case 3: {
					contadorDeDigito();
					break;
				}
				case 4: {
					invertidor();
					break;
				}
				case 5: {
					posicionDelDigito();
					break;
				}
				case 6: {

				}
				case 7: {

				}
				case 8: {

				}
				case 9: {

				}
				case 10: {

				}
				case 11: {
					fin = false;
					System.out.println("biblioteca finalizada.");
					break;
				}


				default:
					System.out.println("Selección inválida. Por favor, eliga una de las 11");
					break;
			}

		}

	}

	public static void capicua() {

		int originalnumero = Util.pedirNumeroUsuario("dame el numero que quiera comprobar: ");
		int invertido = 0;
		int numero = originalnumero;
		while (numero > 0) {
			int resto = numero % 10;
			invertido = invertido * 10 + resto;
			numero /= 10;

		}

		if (invertido == originalnumero) {
			System.out.println("el numero es capicua");
		} else {
			System.out.println("el numero no es capicua");
		}

	}

	public static void primo() {
		int num = Util.pedirNumeroUsuario("dime un numero: ");
		boolean esPrimo = true;
		int divisible = 2;

		while (divisible <= num / 2) {
			if (num % divisible == 0) {
				esPrimo = false;
				break;
			}
			divisible++;

		}

		if (esPrimo && num > 1) {
			System.out.println("el numero " + num + " es primo ");
		} else {
			System.out.println("el numero " + num + " no es primo ");
		}
	}

	public static void contadorDeDigito() {

		int num = Util.pedirNumeroUsuario("dame un numero positivo: ");
		int contador = 0;
		while (num > 0) {

			num /= 10;
			contador++;
		}

		System.out.println("El numero tiene " + contador + " digitos");

	}

	public static void invertidor() {

		int originalnumero = Util.pedirNumeroUsuario("dame el numero que quiere invertir: ");
		int invertido = 0;
		int numero = originalnumero;
		while (numero > 0) {
			int resto = numero % 10;
			invertido = invertido * 10 + resto;
			numero /= 10;

		}

		System.out.print("EL NUMERO INVERTIDO ES " + invertido + " " + originalnumero);
	}

	public static void posicionDelDigito() {
		int numeroUsuario = Util.pedirNumeroUsuario("Dame un número positivo: ");
		int digito = Util.pedirNumeroUsuario("Dame el dígito que quieres encontrar: ");
		int contador = 1;
		int posicion = -1;

		while (numeroUsuario > 0) {
			int digitoActual = numeroUsuario % 10;
			if (digitoActual == digito) {
				posicion = contador;
				break;
			}
			numeroUsuario /= 10;
			contador++;
		}

		if (posicion != -1) {
			System.out.println("El dígito " + digito + " está en la posición " + posicion + " empezando por el final");
		} else {
			System.out.println("El dígito " + digito + " no se encuentra en el número.");
		}

			}

		}

