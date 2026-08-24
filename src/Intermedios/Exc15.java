package Intermedios;

import java.util.Scanner;

public class Exc15 {
    public static void main() {
        Scanner leer = new Scanner(System.in);
        int num1,num2,num3;
        System.out.println("Digite el primer numero: ");
        num1 = leer.nextInt();
        System.out.println("Digite el segundo numero: ");
        num2 = leer.nextInt();
        System.out.println("Digite el tercer numero: ");
        num3 = leer.nextInt();
        if (num1 > num2 && num1 > num3) {
            System.out.println("El PRIMER numero es el MAYOR");
        }
        else if(num2>num1 && num2>num3){
            System.out.println("El SEGUNDO numero es el MAYOR" );
        }
        else{
            System.out.println("El TERCER numero es el MAYOR" );
        }
    }
}
