import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        App calculator = new App();
        Scanner scanner = new Scanner(System.in);
        boolean inOperation = true;
        boolean isFirstTime = true;

        while (inOperation) {
            if (isFirstTime) {
                boolean isFinished = firstOperation(scanner, calculator);
                if (isFinished)
                    break;

                isFirstTime = false;
                continue;
            }

            boolean is_finished = subsequentOperation(scanner, calculator);
            if (is_finished)
                break;
        }
    }

    private static boolean firstOperation(Scanner scanner, App calculator) {
        validationFirstOperation(scanner, calculator);

        System.out.print("Deseja finalizar a operação, (s, n) ? ");
        char isFinished = scanner.next().charAt(0);

        if (isFinished == 's') {
            System.out.println("Resultado final: " + calculator.value);
            scanner.close();
        }
        return isFinished == 's';
    }

    private static boolean subsequentOperation(Scanner scanner, App calculator) {
       validationSubsequentOperation(scanner, calculator);

        System.out.print("Deseja finalizar a operação, (s, n)? ");
        char isFinished = scanner.next().charAt(0);

        if (isFinished == 's') {
            System.out.println("Resultado final: " + calculator.value);
            scanner.close();
        }
        return isFinished == 's';
    }

    private static void validationFirstOperation(Scanner scanner, App calculator) {
        System.out.print("Digite o primeiro número: ");
        int n1 = scanner.nextInt();

        System.out.print("Digite a operação (+, -, *, /, C): ");
        char operation = scanner.next().charAt(0);

        System.out.print("Digite o segundo número: ");
        int n2 = scanner.nextInt();

        if (operation == '/' && n2 == 0)
            throw new IllegalArgumentException("Não é possivel dividir por 0.");

        switch (operation) {
            case '+':
                calculator.addFirstTime(n1, n2);
                break;
            case '-':
                calculator.subtractFirstTime(n1, n2);
                break;
            case '*':
                calculator.multiplyFirstTime(n1, n2);
                break;
            case '/':
                calculator.divideFirstTime(n1, n2);
                break;
            case 'C':
                calculator.reset();
                break;
            default:
                System.out.println("Operação inválida");
        }
    }

    private static void validationSubsequentOperation(Scanner scanner, App calculator) {
        System.out.print("Digite a operação (+, -, *, /, C): ");
        char operation = scanner.next().charAt(0);

        System.out.print("Digite um número: ");
        int n = scanner.nextInt();

        if (operation == '/' && n == 0)
            throw new IllegalArgumentException("Não é possivel dividir por 0.");

        switch (operation) {
            case '+':
                calculator.add(n);
                break;
            case '-':
                calculator.subtract(n);
                break;
            case '*':
                calculator.multiply(n);
                break;
            case '/':
                calculator.divide(n);
                break;
            case 'C':
                calculator.reset();
                break;
            default:
                break;
        }
    }
}
