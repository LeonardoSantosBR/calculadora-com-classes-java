public class App {
    public int value = 0;

    public int addFirstTime(int n1, int n2){
        value = n1 + n2;
        return value;
    };

    public int add(int n){
        value += n;
        return value;
    };

    public int subtractFirstTime(int n1, int n2){
        value = n1 - n2;
        return value;
    }

    public int subtract(int n){
        value -= n;
        return value;
    };

    public int divideFirstTime(int n1, int n2){
        value = n1 / n2;
        return value;
    }

    public int divide(int n){
        value /= n;
        return value;
    };

    public int multiplyFirstTime(int n1, int n2){
        value = n1 * n2;
        return value;
    }

    public int multiply(int n){
        value *= n;
        return value;
    };

    public int reset(){
        value = 0;
        return value;
    }
}
