import java.util.Scanner;

public class IsWeekend {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("введите день недели \nMonday, Tuesday, Wednesday, Thursday, Friday, Saturday, Sunday  ");
        String weekDay = scan.nextLine();
        int result = isWeekend(weekDay);
        System.out.print("Результат " + result);

    }

    public static int isWeekend(String weekDay) {
        //Monday, Tuesday, Wednesday, Thursday, Friday, Saturday, Sunday
        int x;
        switch (weekDay) {
            case "Monday", "Tuesday", "Wednesday", "Thursday", "Friday": {
                x = 5;
                return x;
            }
            case "Saturday", "Sunday": {
                x = 3;
                return x;
            }
            default: {
                System.out.print("Незнаю такого дня недели");
                x = 0;
                return x;
            }
        }
    }
}
