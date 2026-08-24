package Basicos;

import java.util.Scanner;

public class Exc17 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int num, i,result;
        System.out.println("Digite um numero para obtener su tabla de multiplicar del 1 al 10: ");
        num = leer.nextInt();
        for (i=0; i<=10; i++){
            result = num*i;
            System.out.println(num + "x" + i + "= " + result);
        }
    }
}
