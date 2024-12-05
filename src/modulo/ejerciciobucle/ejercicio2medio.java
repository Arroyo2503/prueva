package modulo.ejerciciobucle;

import java.util.Scanner;

import utils.ArrayUtil;
import utils.Util;

public class ejercicio2medio {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		int menor = 0;
		int mayor = 0;
		int num = 0;
		int veces = Util.pedirNumeroUsuario("Dime Cuanto numero quiere que te pida");
		Scanner sc = new Scanner(System.in);
		
		for(int i=0;i<veces;i++ ) {
			System.out.println("Dime el siguiente numero:");
			num = sc.nextInt();
			
			if(i == 0) {
				mayor = num;
				menor =num;
			}
			
				if(num > mayor ) {
					mayor = num;
				}
				if(num < menor) {
					menor = num;
				
			}
		}
		System.out.println("tu numero mayor: " + mayor);
		System.out.println("tu numero menor: " + menor);
	}

}
