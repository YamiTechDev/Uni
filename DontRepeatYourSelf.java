import org.jetbrains.annotations.NotNull;

public class DontRepeatYourSelf {

    public static boolean isWeekend(@org.jetbrains.annotations.NotNull String dayName) {
        return dayName.equalsIgnoreCase("sunday") || dayName.equalsIgnoreCase("saturday");
    }

    public static int weekendCount(String @NotNull [] days) {
        int weekendCounter = 0;
        for (String day : days) {
            if (isWeekend(day)) {
                weekendCounter++;
            }
        }
        return weekendCounter;
    }

    public static int weekdayCount(String @NotNull [] days) {
        int weekDayCounter = 0;
        for (String day : days) {
            if (!isWeekend(day))//  ! меняем условия на противоположные
                weekDayCounter++;
        }
        return weekDayCounter;
    }


    public static void main(String[] args) {
        String[] days = new String[]{"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
        int resultWeekendCount = weekendCount(days);
        int resultWeekDayCount = weekdayCount(days);
        System.out.println(resultWeekDayCount + " resultWeekDayCount");
        System.out.println(resultWeekendCount + " resultWeekendCount");
    }
}


