package Intermedios;

import java.util.Scanner;

public class Exc13 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int year;
        System.out.print("Ingresa el anio: ");
        year = leer.nextInt();
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println("El anio es Bisiesto");
        }
        else {
            System.out.println("El anio no es Bisiesto");
        }

    }
}
