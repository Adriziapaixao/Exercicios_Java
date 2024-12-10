import java.util.Scanner;

public class MultiplosNumero {

    public static void main(String args[]){

        Scanner scr = new Scanner(System.in);

        System.out.println(" Digite o primeiro número: ");
        int n = scr.nextInt();

        System.out.println(" Digite o limite: ");
        int m = scr.nextInt();

        System.out.println("Multiplos de " + n + "até " + m + ";");
        for (int i = n; i <= m; i += n){
            System.out.println(i + " ");
        }
        scr.close();
    }
}
