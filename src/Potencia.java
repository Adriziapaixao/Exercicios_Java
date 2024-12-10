import java.util.Scanner;

public class Potencia {

    public static void main(String args[]){

        System.out.println("---POTENCIAÇÃO---");

        Scanner scr = new Scanner(System.in);
        System.out.println("Digite a base: ");
        int base = scr.nextInt();

        System.out.println("Digite a expoente: ");
        int expoente = scr.nextInt();
        long resultado = calculoPotencia(base, expoente);
        System.out.println(base + " elevado ao " + expoente + " é: " + resultado);

        scr.close();
    }
    public static long calculoPotencia(int base, int expoente){
        long resultado = 1;
        for (int i = 0; i< expoente; i++){
            resultado *= base;
        }
        return resultado;
    }
}
