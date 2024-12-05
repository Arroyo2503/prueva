package array.ejercicio;

import utils.ArrayUtil;

public class ejercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		int[]numeros = ArrayUtil.arraydeNumerosAleatorios(150);
		
		ArrayUtil.imprimirArray(numeros);
		
		System.out.println();
		
		int suma = 0;
		int menor = numeros[0];
		int mayor = numeros[0];
		
		for (int i=0;i < numeros.length;i++) {
		
			suma += numeros[i];
			if (numeros[i] < menor) menor = numeros[i];
			if (numeros[i] > mayor) mayor = numeros[i];
		}
		
        double media = (double) suma / numeros.length;

        System.out.println("Suma: " + suma);
        System.out.println("Media: " + media);
        System.out.println("Menor: " + menor);
        System.out.println("Mayor: " + mayor);
        
		}

	}

