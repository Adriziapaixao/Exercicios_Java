import java.util.Scanner;

public class NumerosPrimos {

    public static void main(String arg[]){

        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um número: ");
        int numero = scanner.nextInt();

        if (numeroPrimo(numero)) {
            System.out.println("Verdadeiro");
            System.out.println("O número " + numero + " é primo.");
        }else {
            System.out.println("Falso");
            System.out.println("O número " + numero + " não é primo.");
        }
        scanner.close();
    }

    public static boolean numeroPrimo(int nunero){
        if (nunero <= 1){
            return false;
        }
        for (int i = 2; i <= Math.sqrt(nunero); i++){
            if (nunero % i == 0) {
                return false;
            }
        }
        return true;
    }
}
