package Intermedios;

import java.util.Scanner;

public class Exc37 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int matriz[][] = new int[3][3];
        int i;
        int j;
        int suma;

        for (i = 0; i < 3; i++) {
            for (j = 0; j < 3; j++) {
                System.out.println("Ingresa un numero para la fila " + (i + 1) + " columna " + (j + 1) + ": ");
                matriz[i][j] = leer.nextInt();
            }
        }

        System.out.println("Suma de cada fila:");
        for (i = 0; i < 3; i++) {
            suma = 0;
            for (j = 0; j < 3; j++) {
                suma = suma + matriz[i][j];
            }
            System.out.println("Fila " + (i + 1) + ": " + suma);
        }

        System.out.println("Suma de cada columna:");
        for (j = 0; j < 3; j++) {
            suma = 0;
            for (i = 0; i < 3; i++) {
                suma = suma + matriz[i][j];
            }
            System.out.println("Columna " + (j + 1) + ": " + suma);
        }
    }
}
