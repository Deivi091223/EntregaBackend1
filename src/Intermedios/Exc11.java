package Intermedios;

import java.util.Scanner;

public class Exc11 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int numero;
        System.out.println("Introduce el numero: ");
        numero = leer.nextInt();
        if(numero<0){
            System.out.println("El numero es negativo");
        }
        else if(numero==0){
            System.out.println("El numero es zero");
        }
        else if (numero>0 && numero%2==0){
            System.out.println("El numero es positivo y par");
        }
        else{
            System.out.println("El numero es positivo e impar");
        }
    }
}
