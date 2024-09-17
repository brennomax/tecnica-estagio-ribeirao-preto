package questao1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean isValid = false;

        while(!isValid) {
            try {
                System.out.print("Digite um número inteiro: ");
                int num = scanner.nextInt();
                var fibonacci = new Fibonacci();
                fibonacci.validityCheck(num);
                isValid = true;
            } catch(InputMismatchException e) {
                System.out.println("Número inválido. Digite um número inteiro e positivo. Tente novamente.");
                scanner.close();
            }
        }
        scanner.close();
    }
}
