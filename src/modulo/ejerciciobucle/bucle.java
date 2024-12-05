package modulo.ejerciciobucle;

import java.security.DrbgParameters.NextBytes;
import java.util.Iterator;
import java.util.Scanner;

public class bucle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner (System.in);
		
		int suma = 0; 
		int num = 0;
		System.out.println("dime cuanto numeros quieres que te pida:" );
		
		int veces = sc.nextInt();
	
		
		
	for(int i=0;i<veces;i++) {
		System.out.println("Dime el siguiente numero:");
		num = sc.nextInt();
		
		if ( num >= 10) {
		
		suma = suma + num;
			
		}
		
		}
	
	System.out.println("el resultado es :" + suma);
	}

}
