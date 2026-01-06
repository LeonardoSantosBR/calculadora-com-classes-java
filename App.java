public class App {
    public int value = 0;

    public int add(int new_value){
        value += new_value;
        return value;
    };

    public int subtract(int new_value){
        value -= new_value;
        return value;
    }

    public int divide(int new_value){
        value /= new_value;
        return value;
    }

    public int multiply(int new_value){
        value *= new_value;
        return value;
    }

    public int reset(){
        value = 0;
        return value;
    }
}
