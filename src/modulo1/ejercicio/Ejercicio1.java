package modulo1.ejercicio;

import java.util.*;

public class Ejercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("introduce un numero entero, decimal y doble:"); 
		Scanner s = new Scanner(System.in);
		
		
		System.out.print("tus numeros son:"
				+s.nextInt()+" "
				+s.nextFloat()+" "
				+s.nextDouble());

		s.close();
	}
}
