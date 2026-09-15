import java.util.Scanner;

public class IsWeekends {
    public static void main(String[] args) {
        Scanner scanNumDay = new Scanner(System.in);
        System.out.println("Введите номер дня недели от 1 до 7 ");
        int weekDayNumber = scanNumDay.nextInt();
        if (isWeek(weekDayNumber) == false) {
            System.out.println("Ваш день недели Суббота или Воскресенье");
        } else if (isWeek(weekDayNumber) == true) {
            System.out.println("Ваш день недели Рабочий");
        }

    }

    public static boolean isWeek(int weekDayNumber) {

        boolean weekDays = false;
        if (weekDayNumber == 7 || weekDayNumber == 6) {
            return weekDays = false;
        } else if (weekDayNumber < 6 && weekDayNumber > 0) {
            return weekDays = true;
        } else if ((weekDayNumber > 7) || (weekDayNumber < 1)) {
            System.out.println("В неделе только 7 дней, НИБОЛЬШЕ И НЕ МЕНЬШЕ ))");
            System.exit(0);
        }
        return weekDays;
    }
}
