import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        App calculator = new App();
        Scanner scanner = new Scanner(System.in);
        boolean in_operation = true;

        while (in_operation) {
            System.out.println("Digite um número:");
            int number = scanner.nextInt();

           System.out.print("Digite a operação (+, -, *, /, C): ");
           char operation = scanner.next().charAt(0);

           switch (operation) {
            case '+':
                calculator.add(number);
                break;
            case '-':
                calculator.subtract(number);
                break;
            case '*':
                calculator.multiply(number);
                break;
            case '/':
                calculator.divide(number);
                break;
            case 'C':
                calculator.reset();
                break;
            default:
                break;
           }

            System.out.print("Deseja finalizar a operação? (S, N)");
            char is_finished = scanner.next().charAt(0);

            if(is_finished == 'S') in_operation= false;
        };
        System.out.println("Resultado final: " + calculator.value);
        scanner.close();
    }
}
