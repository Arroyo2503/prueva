package ejercico.entregar;

import java.util.Scanner;

import utils.ArrayUtil;
import utils.Util;

public class WeatherForecast {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	     Scanner scanner = new Scanner(System.in);

	        System.out.println("1. Primavera");
	        System.out.println("2. Verano");
	        System.out.println("3. Otoño");
	        System.out.println("4. Invierno");
	        System.out.print("Selecciona la estación (1-4): ");
	        int season = scanner.nextInt();

	        int maxTemp = 0, minTemp = 0;
	        String weather = "";

	        int numeros = Util.pedirNumeroAleatorio();

	        switch (season) {
	            case 1: // Primavera
	                minTemp = 10 + numeros % 30; // 10 a 39
	                maxTemp = minTemp + (Util.pedirNumeroAleatorio() % (40 - minTemp));
	                weather = (Util.pedirNumeroAleatorio() % 100) < 60 ? "Soleado" : "Nublado"; // 60% Soleado, 40% Nublado
	                break;
	            case 2: // Verano
	                minTemp = 20 + numeros % 26; // 20 a 45
	                maxTemp = minTemp + (Util.pedirNumeroAleatorio() % (46 - minTemp));
	                weather = (Util.pedirNumeroAleatorio() % 100) < 90 ? "Soleado" : "Nublado"; // 90% Soleado, 10% Nublado
	                break;
	            case 3: // Otoño
	                minTemp = 5 + numeros % 29; // 5 a 33
	                maxTemp = minTemp + (Util.pedirNumeroAleatorio() % (34 - minTemp));
	                weather = (Util.pedirNumeroAleatorio() % 100) < 50 ? "Soleado" : "Nublado"; // 50% Soleado, 50% Nublado
	                break;
	            case 4: // Invierno
	                minTemp = 1 + numeros % 28; // 1 a 28
	                maxTemp = minTemp + (Util.pedirNumeroAleatorio() % (29 - minTemp));
	                weather = (Util.pedirNumeroAleatorio() % 100) < 40 ? "Soleado" : "Nublado"; // 40% Soleado, 60% Nublado
	                break;
	            default:
	                System.out.println("Estación no válida.");
	                return;
	        }
	        System.out.println();
	        System.out.println("Previsión del tiempo");
	        System.out.println();
	        System.out.println("Temperatura mínima: " + minTemp + "ºC");
	        System.out.println("Temperatura máxima: " + maxTemp + "ºC");
	        System.out.println("Clima: " + weather);
	    }
	
	}

