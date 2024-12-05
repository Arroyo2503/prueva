package modulo.ejerciciobucle;

import java.util.Scanner;

import utils.ArrayUtil;
import utils.Util;

public class ejercicio2alto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int menor = 0;
		int mayor = 0;
		int num = 1;
	
		Scanner sc = new Scanner(System.in);
		
		for(int i=0;i>-1;i++ ) {
			if(num != 0) {
				num = Util.pedirNumeroUsuario("dame un numero para sumarlo, 0 para salir" );
				
			
			if(i == 0) {
				mayor = num;
				menor =num;
			}
			
				if(num > mayor && num != 0 ) {
					mayor = num;
				}
				if(num < menor && num != 0) {
					menor = num;
				}
		}else break;
		
	}
		System.out.println("tu numero mayor: " + mayor);
		System.out.println("tu numero menor: " + menor);
	}
}

