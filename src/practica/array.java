package practica;

import utils.ArrayUtil;

public class array {

    public static void main(String[] args) {

        int[] array = new int[10];

        for (int i = 0 ; i < 10 ; i++ ){

            array[i] = i+1;
        }
        System.out.println("Arrat inicializado: ");
        ArrayUtil.imprimirArray(array);

    }

}
