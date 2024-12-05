package modulo.ejerciciobucle;

import java.util.Scanner;

import utils.ArrayUtil;
import utils.Util;

public class ejercicio1medio {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int suma = 0;
		int resultado = 0;
		int num = 0;
		int veces = Util.pedirNumeroUsuario("Dime Cuanto numero quiere que te pida");
		Scanner sc = new Scanner(System.in);
		
		for(int i=0;i<veces;i++ ) {
			System.out.println("Dime el siguiente numero:");
			num = sc.nextInt();
			
			suma = num + suma;
				
			}
		resultado = suma/veces;	
		System.out.println("tu media: " + resultado);
	}

}
