public class Fatorial {

    public static void main (String[] args){

        int x = 5;
        int y = x;

        while (x>1) {
            y *= (x-1);
            x--;

            System.out.println("Fatorial de " + x + " é: " + y + "!");
        }
    }
}
