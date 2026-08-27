package Basicos;

import java.util.Scanner;

public class Exc33 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int numeros[] = new  int[8];
        int i;
        int valMayor=0;
        int valMin=0;
        for (i=0;i<8;i++){
            System.out.println("Introduce el numero en posicion de "+ (i+1) + ": ");
            numeros[i]=leer.nextInt();
            if (numeros[i]>valMayor){
                valMayor=numeros[i];
            }
        }
        valMin=numeros[0];
        for (i=0;i<8;i++) {
            if (numeros[i] < valMin) {
                valMin = numeros[i];
            }
        }
        System.out.println("El valor mayor es : "+valMayor);
        System.out.println("El valor menor es : "+valMin);
    }
}
