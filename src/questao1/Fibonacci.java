package questao1;

public class Fibonacci {
    public void validityCheck(int num) {
        int nextNumber = 0, num1 = 0, num2 = 1;
        for(int i = 1; i < num; i++) {
            if(nextNumber >= num) {
                break;
            }
            nextNumber = num1 + num2;
            num1 = num2;
            num2 = nextNumber;
            //System.out.print(nextNumber + " ");
        }

        if(num == nextNumber){
            System.out.println("O número pertence a sequência de Fibonacci!");
        } else {
            System.out.println("O número NÃO pertence a sequência de Fibonacci!");
        }
    }
}
