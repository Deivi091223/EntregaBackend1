package Basicos;

import java.util.Scanner;

public class Exc31 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int[]nums= new int[5];
        int i;
        for(i=0;i<5;i++){
            System.out.println("Digite um numero en posicion " + (i+1) + ": ");
            nums[i]=leer.nextInt();
        }
        i=0;
        while(i<5){
            System.out.println("Numero en pocision " + (i+1) + ": " + nums[i]);
            i++;
        }
    }
}
