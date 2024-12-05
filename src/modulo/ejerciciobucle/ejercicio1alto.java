package modulo.ejerciciobucle;

import java.util.Scanner;

import utils.ArrayUtil;
import utils.Util;

public class ejercicio1alto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int suma = 0;
		int resultado = 0;
		int num = 1;
		int contador = 0;
		Scanner sc = new Scanner(System.in);
		
		for(int i=0;i>-1;i++ ) {
			if(num != 0) {
			num = Util.pedirNumeroUsuario("dame un numero para sumarlo, 0 para salir" );
			
			
			suma = num + suma;
		
			}else {
				contador = contador -1;
				break;
			}
			contador++;	
			}
		System.out.println(contador);
		
		resultado = suma/contador;	
		System.out.println("el suma: " + suma);
		System.out.println("tu media: " + resultado);
	}

}
