import java.util.Scanner;

public class ConversaoBinarioDecimal {

    public static void main(String args[]){

        Scanner scr = new Scanner(System.in);
        System.out.println("Digite um número binário: ");
        String binario = scr.nextLine();

        int decimal = convertDecimal(binario);
        System.out.println("O número binário " + binario + " em decimel é: " + decimal);

        scr.close();
    }
    public static int convertDecimal(String binario) {
        int decimal = 0;
        int comprimento = binario.length();

        for (int i = 0; i < comprimento; i++){
            if (binario.charAt(comprimento - 1 - i) == '1'){
                decimal += Math.pow(2, i);

            }
        }
        return decimal;
    }

}
