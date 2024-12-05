package array.ejercicio;

import java.util.Scanner;

import utils.ArrayUtil;

public class ejercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		
		  System.out.print("Dame el número mínimo: ");
	        int min = scanner.nextInt();
	        System.out.print("Dame el número máximo: ");
	        int max = scanner.nextInt();	
		int[] numeros = ArrayUtil.arraydeNumerosAleatoriosUsuario(min, max);
		
		
		ArrayUtil.imprimirArray(numeros);
		}
	}


