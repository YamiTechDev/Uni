import java.util.Scanner;

public class CharExpression {
    public static void main(String[] args) {
        System.out.println("введите число к которое прибавить к а ");
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        char result = charExpression(a);
        System.out.print(result);
    }

    public static char charExpression(int a) {
        return (char) ('a' + a);
    }
}
