package modulo.ejerciciobucle;

import java.util.Scanner;

import utils.ArrayUtil;
import utils.Util;

public class ejercicio3medio {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int resultado = 0;
		int num = Util.pedirNumeroUsuario("Dime el numero que quiere saber los multiplo ");
		Scanner sc = new Scanner(System.in);
		System.out.println("los multiplo de " + num + " son");
		
		for(int i=0;resultado<100;i++ ) {
			
			resultado = num*i;
			
			System.out.println(+ resultado);
		}
	}

	
	
}
