import java.util.Scanner;

public class CheckWeekend {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("введите день недели \nMonday, Tuesday, Wednesday, Thursday, Friday, Saturday, Sunday  ");
        String weekday = scanner.nextLine();
        System.out.println(checkWeekend(weekday));
    }
    public static String checkWeekend(String weekday){
        String dayOff = "Ура, выходной!";
        String workDay = "Надо ещё поработать";
        String checkWeekendResult = (weekday.equals("Saturday") || weekday.equals("Sunday"))?dayOff:workDay;
        return checkWeekendResult;
    }
}
