public class Main {

    public static void main(String[] args) throws MyNewException {
        double a = 10;
        double b = 2;

        testExp(a,b);
    }

    static class MyNewException extends Exception { // создаю исключение

        public MyNewException(String message) {
            super(message);

        }
    }

    public static void testExp(double a, double b) throws MyNewException {    // создаю метод который может выбросить MyNewException
        if (b == 0) {
            throw new MyNewException(" Делить на 0 нельзя ");
        }
        double result = a / b;//метод принимает а и б и делит а на б, выводит результат на экран
        System.out.println(result);
    }
}