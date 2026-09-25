import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class IsGmailOrOutlookVersion2 {
    public static void main(String[] args) {
        String email = "etwetjkb@outLook.com";
        String myResult = String.valueOf(isGmailOrOutlookVersion2(email));
        System.out.print(myResult);
    }

    public static boolean isGmailOrOutlookVersion2(String email) {
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
// сначала реализовал так
        //Pattern emailPattern1 = Pattern.compile("^[a-zA-Z0-9._]+@outlook.com$");//проверяем соответствует ли шаблону 1
        //Pattern emailPattern2 = Pattern.compile("^[a-zA-Z0-9._]+@gmail.com$");//проверяем соответствует ли шаблону 2
        //Matcher outlookPatterns = emailPattern1.matcher(email);
        //Matcher gMailPatterns = emailPattern2.matcher(email);
        //if (outlookPatterns.matches() || gMailPatterns.matches())
        //return true;
        //else return false;

////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        // другая реализация функции
        // вижу следующюю проблему - некорректно работает если пользователь написал емаил с большой буквы
        // добавил агрумент Pattern.CASE_INSENSITIVE в Pattern.compile для игнора регистра

        if (email == null) {
            return false;
        }

        Pattern EMAIL_PATTERN = Pattern.compile("^[a-zA-Z0-9._]+@(outlook|gmail)\\.com$", Pattern.CASE_INSENSITIVE);//создаем один паттерн для проверки значений емаил,
        // дополнительный агрумент Pattern.CASE_INSENSITIVE передаваемый создатель шаблонов делает нечувствительным к регистру шаблон.

        Matcher matcher = EMAIL_PATTERN.matcher(email);// создаем поиск по шаблону
        return matcher.matches();// возвращаем булиевый результат поиска(true/false)
    }

}
