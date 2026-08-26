package Intermedios;

import java.util.Scanner;

public class Exc23 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int respuesta=0;
        int n=0;
        while(n<3){
            System.out.println("Que quiere: Ingrese 1 Para Sumar, 2 para Restar o 3 para Salir");
            respuesta = leer.nextInt();
            switch (respuesta){
                case 1:
                    System.out.println("Ustesd quiere sumar");
                    break;
                case 2:
                    System.out.println("Ustesd quiere restar");
                    break;
                default:
                    n=4;
                    System.out.println("Usted a desidido salirse");
            }
        }
    }
}
