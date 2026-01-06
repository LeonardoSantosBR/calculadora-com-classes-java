public class Main {
    public static void main(String[] args){
        App calculadora = new App();
        System.out.println("valor inicial: " + calculadora.value);
        System.out.println("somar 100: " + calculadora.add(100));
        System.out.println("multiplicar por 5: " + calculadora.multiply(5));
        System.out.println("dividir por 2: " + calculadora.divide(2));
        System.out.println("resetar: " + calculadora.reset());
    }
}
