package Basicos;

import java.awt.geom.Area;
import java.util.Scanner;

public class Exc39 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        float base= 0;
        float altura= 0;
        double areasRectangulos= 0;
        System.out.println("Digite base del rectangulo: ");
        base =leer.nextFloat();
        System.out.println("Digite altura del rectangulo: ");
        altura = leer.nextFloat();

        try{
            areasRectangulos = arearRectangulo(base, altura);
            System.out.println("Area del rectangulo: " + areasRectangulos);
        }catch(Exception e){
            System.out.println("ERRO " + e.getMessage());
        }
    }
    private static double arearRectangulo(float base, float altura){
        return base*altura;
    }
}
