package modulo1.ejercicio;

import utils.ArrayUtil;
import utils.Util;

import java.util.Scanner;

public class bucle {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //bucle for

        //ejercicio1
//        for (int i = 1; i <= 10; i++) {
//
//        System.out.println("contador: " + i);
//
//        }

        //ejercicio2
//        System.out.print("Ingresa un numero del que quiera calcular el factorial: ");
//        int numero = scanner.nextInt();
//
//        int factorial = 1;
//
//        for (int i = 1; i <= numero; i++){
//
//            factorial*= i;
//
//        }
//            System.out.println("el factorial de " + numero+ " es: " + factorial);

        //ejercicio3
//        System.out.println("dame los numeros pares que quiere que sume");
//
//        int n = scanner.nextInt();
//
//        int suma = 0;
//
//        for(int i = 1 ; i <= n; i++){
//
//            suma =+ i * 2;
//
//        }
//        System.out.println("la suma de los primeros "+ n + " numeros pares es " + suma);

        //ejercicio4

//        System.out.print("dime el numero del quiere los 10 primeros numero de la tabla de multiplicar: ");
//
//        int n = scanner.nextInt();
//
//        int multiplicacion = 0;
//
//        System.out.println("la tabla de multiplicar del " + n);
//        for (int i = 1; i <= 10; i++){
//
//        multiplicacion = i *n;
//
//        System.out.println(+n+"x"+i+"="+ multiplicacion);
//
//        }

        //ejercicio5
//        System.out.print("dime hasta que numero quiere comprar los impares: ");
//        int limite = scanner.nextInt();
//
//
//        System.out.println("Numeros impares entre 1 y " + limite + ":");
//        for (int i = 1 ; i <= limite; i++){
//
//            if( i % 2 != 0){
//                System.out.print(i+ " ");
//            }
//
//        }

        //ejercicio6
//        System.out.print("Dame el numero inicial: ");
//        int inicial = scanner.nextInt();
//        System.out.print("Dame el numero final: ");
//        int fin = scanner.nextInt();
//
//        int suma = 0;
//
//        for(int i = inicial; i <= fin; i++) {
//
//           suma += i ;
//
//        }
//
//            System.out.println("la suma de los numero entre " + inicial+ " y " + fin + "(ellos incluidos) = " + suma );


        //bucle while


        //ejercicio1
//        int numeroSecreto= Util.pedirNumeroAleatorioEntreDosNumeros(1, 100);
//
//        int intento =0;
//
//        System.out.print("adivina el numero del 1 al 100");
//        while(numeroSecreto != intento){
//            intento = scanner.nextInt();
//
//            if (intento < numeroSecreto){
//                System.out.print("el numero es mayor");
//            } else if (intento > numeroSecreto){
//                System.out.print("El numero es menor");
//            }else {
//                System.out.print("has acertado enhorabuena");
//            }
//        }
//
//

        //ejercicio2

//        int num = Util.pedirNumeroUsuario("dame un numero positivo: ");
//        int contador = 0;
//        while( num > 0){
//
//            num /= 10;
//            contador++;
//        }
//
//        System.out.println("El numero tiene " + contador+ " digitos");

        //ejercicio3

//        int num = Util.pedirNumeroUsuario("dime un numero: ");
//        boolean esPrimo = true;
//        int divisible = 2;
//
//        while(divisible <= num / 2){
//        if (num % divisible == 0){
//            esPrimo = false;
//            break;
//        }
//         divisible++;
//
//        }
//
//        if(esPrimo && num > 1){
//            System.out.println("el numero "+num + " es primo ");
//        }else{
//            System.out.println("el numero "+num + " no es primo ");
//        }

        //ejercicio 4

//                System.out.print("Ingresa el primer número: ");
//                int numero1 = scanner.nextInt();
//
//                System.out.print("Ingresa el segundo número: ");
//                int numero2 = scanner.nextInt();
//
//                int mcm = (numero1 > numero2) ? numero1 : numero2;
//
//                System.out.println(mcm+ " ");
//
//                // Bucle para encontrar el MCM
//                while (true) {
//                    System.out.println("divisiones: " + mcm + "/" + numero1 + " division 2: " + mcm + "/" + numero2);
//                    if (mcm % numero1 == 0 && mcm % numero2 == 0) {
//
//
//                        System.out.println("El MCM de " + numero1 + " y " + numero2 + " es " + mcm);
//                        break;
//
//                    }
//                    mcm++;
//                    System.out.println(mcm);
//                }
//
//                scanner.close();


        //ejercicio 5

//        int numero = Util.pedirNumeroUsuario("inserta el numero que quiera calcular: ");
//        int suma = 0;
//
//        while (numero > 0){
//            int resto = numero % 10;
//            suma += resto;
//            numero /= 10;
//        }
//        System.out.println("La suma de los digitos es " + suma);


        //ejercicio 6

        int originalnumero = Util.pedirNumeroUsuario("dame el numero al que quiera dar la vuelta: ");
        int invertido = 0;
        int numero = originalnumero;
        while(numero > 0){
            int resto = numero % 10;
            invertido = invertido * 10 + resto;
            numero /= 10;

        }

        System.out.print("EL NUMERO INVERTIDO ES " + invertido + " " + originalnumero);

        //bucle do-while

        //ejercicio1
//        int suma = 0 ;
//        int numero;
//
//            System.out.println("dime un numero para sumar si quiere terminar pulse 0 ");
//        do {
//            numero = scanner.nextInt();
//            suma += numero;
//
//
//        }while (numero != 0);
//
//        System.out.print("la suma de to los numeros es: "+ suma);

        //ejercicio2


//        int edad;
//        do {
//            edad = Util.pedirNumeroUsuario("dime tu edad(etre 1 y 120): ");
//
//            if (edad < 1 || edad > 120 ) {
//                System.out.println("edad no valida, intenta nuevamente");
//            }
//        } while (edad < 1 || edad > 120 );
//
//        System.out.println("edad ingresada correctamente: " + edad);

    }
}
