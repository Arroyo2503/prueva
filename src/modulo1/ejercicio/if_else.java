package modulo1.ejercicio;

import java.util.Scanner;

public class if_else {

//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//         System.out.println("pon tu calificacion del 1-100: ");
//        int numero = scanner.nextInt();
//
//        if(numero >= 50 ) {
//            System.out.println("has aprovado");
//        }else {
//            System.out.println("has suspendido");
//        }
//    }

//    public static void main(String[] args){
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("dame un numero");
//        int numero =scanner.nextInt();
//
//        if (numero == 0){
//            System.out.println("tu numero es cero ");
//        }else if (numero > 0){
//            System.out.println("el  numero: "+ numero +" es positivo ");
//        }else {
//            System.out.println("el  numero: "+ numero +" es negativo ");
//        }
//
//    }

//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//
//        System.out.print("dame el primer numero: ");
//        int num1 = scanner.nextInt();
//        System.out.print("dame el segundo numero: ");
//        int num2 = scanner.nextInt();
//
//        if(num1 > num2){
//            System.out.println("el numero "+ num1 + " es mayor al numero " + num2);
//        }else if (num2 == num1){
//            System.out.println("los numeros son iguales");
//        }else
//            System.out.println("el numero "+ num2 + " es mayor al numero " + num1);
//
//    }

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("dame un año: ");
        int anio = scanner.nextInt();

        if ((anio % 4 == 0 && anio % 100 != 0) || (anio % 400 == 0) ) {
        System.out.println("el año "  + anio + " es bisiesto");

        }else {
            System.out.println("el año "  + anio + " no es bisiesto");
        }


    }

}
