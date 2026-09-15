import java.math.BigInteger;
import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        System.out.print("Введите число для вычисления факториала ");
        Scanner scanner = new Scanner(System.in);
        int userNum = scanner.nextInt();
        BigInteger factorial = factorial(userNum);
        System.out.print("Факториал числа равен " + factorial);
    }

    public static BigInteger factorial(int userNum) {
        BigInteger result = BigInteger.ONE;
        for (int i = 1; i <= userNum; i++) {
            result = result.multiply(BigInteger.valueOf(i));
        }
        return result;
    }

}
