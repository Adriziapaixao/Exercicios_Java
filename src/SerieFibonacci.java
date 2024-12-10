import java.util.Scanner;

public class SerieFibonacci {

    public static void main(String args[]){

        Scanner scr = new Scanner(System.in);
        System.out.println("Digite um número: ");
        int n = scr.nextInt();

        System.out.println("Os primeiros n " + n + " números da série Fibonacci são: ");
        for (int i = 0; i < n; i++){
            System.out.println(fibonacci(i) + " ");
        }
        scr.close();
    }
    public static int fibonacci(int num){
        if (num <= 1){
            return num;
        }
        return fibonacci(num - 1) + fibonacci(num - 2);
    }
}
