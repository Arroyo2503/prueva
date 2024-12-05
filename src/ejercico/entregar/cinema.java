package ejercico.entregar;

import java.util.Scanner;

public class cinema {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
        // Solicitar datos al usuario
        System.out.print("Día de la semana: ");
        String diaSemana = scanner.nextLine().toLowerCase();
        System.out.print("Número de entradas: ");
        int numEntradas = scanner.nextInt();
        System.out.print("¿Tienes tarjeta de estudiante? (si/no): ");
        String tarjetaEstudiante = scanner.next().toLowerCase();

        // Definir precios
        double precioBase = 8.0;
        double precioMiercoles = 5.0;
        double precioPareja = 11.0;
        double descuentoEstudiante = 0.10;

        // Calcular precio total
        double precioTotal = 0.0;

        if (diaSemana.equals("miércoles")) {
            precioTotal = numEntradas * precioMiercoles;
        } else if (diaSemana.equals("jueves")) {
            int parejas = numEntradas / 2;
            int individuales = numEntradas % 2;
            precioTotal = (parejas * precioPareja) + (individuales * precioBase);
        } else {
            precioTotal = numEntradas * precioBase;
        }

        // Aplicar descuento de estudiante si corresponde
        if (tarjetaEstudiante.equals("si")) {
            precioTotal -= precioTotal * descuentoEstudiante;
        }

        // Mostrar el precio total
        System.out.printf("El precio total es: %.2f euros%n", precioTotal);
    }

	}


