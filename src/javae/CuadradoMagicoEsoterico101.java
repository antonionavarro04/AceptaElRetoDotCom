package javae;

import funciones.PerArrays;

public class CuadradoMagicoEsoterico101 {
    static java.util.Scanner sc = new java.util.Scanner(System.in);

    public static String magicOrEsoteric(int array[][]) {
        PerArrays.printArray(array);

        return "";
    }

    public static void main(String[] args) {
        int numFilas;

        for (;;) {
            numFilas = sc.nextInt();

            if (numFilas == 0)
                break;

            for (int filas = 0; filas < array.length; filas++) {
                for (int columnas = 0; columnas < array[0].length; columnas++) {
                    array[filas][columnas] = sc.nextInt();
                }
            }

            magicOrEsoteric(numFilas);
        }
    }
}
