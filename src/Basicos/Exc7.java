package Basicos;

import java.util.Scanner;

public class Exc7 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int numero;
        System.out.print("Digite algun numero: ");
        numero = leer.nextInt();
        if (numero % 2 == 0){
            System.out.println("Su numeo es par");
        }
        else{
            System.out.println("Su numeo es impar");
        }
    }
}
