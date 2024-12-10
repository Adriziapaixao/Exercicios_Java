import java.util.Scanner;

public class NumeroInvertido {

    public static void main(String args[]){
        Scanner scr = new Scanner(System.in);
        System.out.println("Digite um numero: ");
        int numero = scr.nextInt();

        int inverterNumero = numeroInvertido(numero);
        System.out.println("O número invertido: " + inverterNumero);

        scr.close();
    }
    public static int numeroInvertido(int numero){
        int invertido = 0;
        while (numero !=0){
            int n1 = numero % 10;
            invertido = invertido * 10 + n1;
            numero /= 10;
        }
        return invertido;
    }
}
