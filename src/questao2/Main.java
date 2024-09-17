package questao2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite uma String: ");
        String text = scanner.nextLine();

        var verificaString = new VerificaString();
        int cont = verificaString.validarA(text);

        if(cont != 0) {
            System.out.println("O caracter 'a' existe na String e aparece " + cont + " vezes.");
        } else {
            System.out.println("O caracter 'a' NÃO existe na String.");
        }
        scanner.close();
    }
}