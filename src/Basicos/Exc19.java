package Basicos;

import java.util.Scanner;

public class Exc19 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int num;
        System.out.println("Digite un numero negativo: ");
        num = leer.nextInt();
        while(num<0){
            System.out.println("Digite otro numero otra vez: ");
            num = leer.nextInt();
            if(num>0){
                System.out.println("Eghhhh Casi que no se da cuenta");
                System.out.println("Se termino");
            }
        }
    }
}
