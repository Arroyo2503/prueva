package modulo.ejerciciobucle;

import java.util.Scanner;

import utils.ArrayUtil;
import utils.Util;

public class ejercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int contadorp = 0;
		int contadorn = 0;
		int num = 0;
		int veces = Util.pedirNumeroUsuario("Dime Cuanto numero quiere que te pida");
		Scanner sc = new Scanner(System.in);
		
		for(int i=0;i<veces;i++ ) {
			System.out.println("Dime el siguiente numero:");
			num = sc.nextInt();
			if(num > 0 ) {
				contadorp = contadorp + 1;
			} else {
				contadorn = contadorn + 1;
				
			}
		}
		System.out.println("el numero de positivo es " + contadorp + " y el numero de negativo es " + contadorn);
	}

}
