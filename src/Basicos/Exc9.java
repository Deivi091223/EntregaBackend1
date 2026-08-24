package Basicos;

import java.util.Scanner;

public class Exc9 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int edad;
        String respuesta;
        System.out.print("Ingrese su edad: ");
        edad = leer.nextInt();
        respuesta= edad <= 18 ? "Mnor de edad" : "Mayor de edad";
        System.out.println("Usted es: " + respuesta);
    }
}
