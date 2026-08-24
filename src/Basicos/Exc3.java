package Basicos;

import java.util.Scanner;

public class Exc3 {
    public static void main() {
        Scanner leer = new Scanner(System.in);
        float tempCelsius, tempFharenheit;
        System.out.println("Digite la temperatur a convertir de Celsius a Fahreneit: ");
        tempCelsius = leer.nextFloat();
        tempFharenheit = tempCelsius * 9/5 + 32;
        System.out.printf("La temperatura en Fharenheits es de: %.2f" , tempFharenheit);
    }
}
