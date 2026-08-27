package Intermedios;

import java.util.Scanner;

public class Exc27 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int num;
        int i;
        int cont_div=0;
        System.out.print("Ingrese un numero mayor a 1: ");
        num=leer.nextInt();
        if(num>1){
            for(i=2;i<num;i++){
                if(num%i==0){
                    cont_div++;
                }
            }
            if(cont_div==0){
                System.out.println("El numero es primo y tiene 2 dvisores.");
            }
            else{
                System.out.println("El numero no es primo y tiene " + cont_div + " divisores.");
            }
        }
        else{
            System.out.println("El numero no se puede evaluar");
        }
    }
}
