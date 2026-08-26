package Intermedios;

import java.util.Scanner;

public class Exc25 {
    public static void main() {
        Scanner leer = new Scanner(System.in);
        int i=1;
        int n;
        double nota;
        double sumNotas=0;
        double promedio;
        System.out.println("Ingrese el numero de calificaciones que quiere registrar");
        n=leer.nextInt();
        while(i<=n){
            System.out.println("Ingrese nota: ");
            nota=leer.nextDouble();
            sumNotas= nota + sumNotas;
            i++;
        }
        promedio= sumNotas / n;
        System.out.printf("El promedio es: %.2f" ,promedio);
    }
}
