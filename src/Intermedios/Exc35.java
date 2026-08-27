package Intermedios;

import java.util.Scanner;

public class Exc35 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int numeros[] = new int[6];
        int i;
        int j=0;
        for(i=0;i<6;i++){
            System.out.println("Ingresa un numero para posicion " + (i+1) + ": ");
            numeros[i] = leer.nextInt();
        }
        for(i=numeros.length-1;i>=0;i--){
            j++;
            System.out.println("Posicion " + j + ": "+ numeros[i]);
        }
    }
}
