package Intermedios;

import java.util.Scanner;

public class Exc29 {
    public static void main(String[] args) {
        int i;
        int n;
        int anterior = 0;
        int actual = 1;
        int newNumber = 0;
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese la posicion d numero de fibonacci: ");
        n = leer.nextInt();

        for (i = 0; i < n; i++) {
            newNumber = anterior + actual;
            anterior = actual;
            actual = newNumber;
            System.out.print( actual + "-");
        }

    }
}
