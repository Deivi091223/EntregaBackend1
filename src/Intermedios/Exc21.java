package Intermedios;

public class Exc21 {
    public static void main(String[] args) {
        int i;
        int n;
        int resultado;
        for (i = 1; i <= 10; i++) {
            for(n=0;n<11;n++){
                resultado= i*n;
                System.out.println(i + " x " + n +" = "+ resultado);
            }
        }
    }
}
