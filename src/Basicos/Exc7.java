package Basicos;

import java.util.Scanner;

public class Exc7 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int numero;
        String respuesta;
        System.out.print("Digite algun numero: ");
        numero = leer.nextInt();
        respuesta= numero % 2 == 0 ? "Par" : "Impar";
        System.out.println("Su numero es: " + respuesta);
            }
}
