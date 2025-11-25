public class Calculator {
    public int add(int a, int b) {
        return a + b;
    }

    public int dif(int a, int b) {
        return a - b;
    }

    public int div(int a, int b) {
        return a / b;
    }

    public int times(int a, int b) {
        return a * b;
    }

    public int solver(int x) {
        int result = add(x, 2);
        result = dif(result, 2);
        result = times(result, 2);
        result = div(result, 2);
        return result;
    }
}
