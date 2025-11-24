public class Calculator {
    public int add(int a, int b){
        return a + b;
    }
    public int dif(int a, int b){
        return a - b;
    }
    public int div(int a, int b){
        return a / b;
    }
    public int times(int a, int b){
        return a * b;
    }
    public int solver(){
        int x = add(2, 3);
        x = times(x, 4);
        x = dif(x, 5);
        return x;
    }
}
