package Basicos;

import java.util.Scanner;

public class Exc5 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        double nota1,nota2,nota3,promedio;
        System.out.println("Digite su nota1: ");
        nota1 = leer.nextDouble();
        System.out.println("Digite su nota2: ");
        nota2 = leer.nextDouble();
        System.out.println("Digite su nota3: ");
        nota3 = leer.nextDouble();
        promedio = (nota1 + nota2 + nota3) / 3.0;
        System.out.println("Su promedio es: " + promedio);
    }
}
