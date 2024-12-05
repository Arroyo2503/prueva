package modulo2.ejercicio;

import java.util.Scanner;

public class ejercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int numeros1=0;
		int numero2=0;
		
		
		System.out.println("introduce un numero");
		Scanner s = new Scanner (System.in);

		numeros1 = s.nextInt();
	
		System.out.println("introduce otro numero");
		
		numero2 = s.nextInt();
		
		if (numeros1 == numero2) {
			System.out.println("los numeros son iguales");
		}else {
			
			if (numeros1 > numero2) {
				System.out.println("el numero mayor es: " + numeros1);
			}else {
				System.out.println("el numero meyor es : " + numero2);
			}
		}
			
	}
}
