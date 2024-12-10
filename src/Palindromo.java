import java.util.Scanner;

public class Palindromo {

    public static void main(String argd[]){

        Scanner scr = new Scanner(System.in);
        System.out.println("Digite um número: ");
        int numero = scr.nextInt();

        if (numeroPalindromo(numero)) {
            System.out.println("Verdadeiro");
            System.out.println("O número " + numero + " é palíndromo.");
        }else {
            System.out.println("Falso");
            System.out.println("O número " + numero + " não é palíndromo.");
        }
        scr.close();
    }
    public static boolean numeroPalindromo(int numero) {
        int numOriginal = numero;
        int invertido = 0;

        while (numero != 0) {
            int num = numero % 10;
            invertido = invertido * 10 + num;
            numero /= 10;
        }
        return numOriginal == invertido;
    }
}
