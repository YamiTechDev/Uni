import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class MyListProgram {

    private static List<Integer> numbers = new ArrayList<>();
        static void main() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введи целые числа через пробел, для прекращения введи не число\n");

        while (scanner.hasNextInt()) {
            int number = scanner.nextInt();
            numbers.add(number);
        }
        System.out.println("В коллекции numbers сохранено " + numbers);
        numbers.removeIf(num -> num % 2 == 0);
        System.out.println("удалены четные значения. \nновая коллекция:" + "\n" + numbers);
        System.out.println("приступаю к сортировке...");
        numbers.sort(Comparator.reverseOrder());
        System.out.println("отсортировано " + numbers);
    }


}


