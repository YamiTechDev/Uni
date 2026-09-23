public class IsGmailOrOutlook {
    public static void main(String[] args) {
        String email = "kata12345@outlook.com";
        String result = String.valueOf(isGmailOrOutlook(email));
        System.out.print(result);
    }

    public static boolean isGmailOrOutlook(String email) {
        if ((email == null) || email.isEmpty()) {// проверяю ввел ли рользователь строку из пробелов или пустую
            System.out.println("email пуст или состоит из пробелов");
            return false;
        } else if (email.endsWith("@outlook.com") || email.endsWith("@gmail.com")) {// проверяю на что заканчивается заканчивается емаил
            String[] partsEmail = email.split("@");

            if (!partsEmail[0].trim().isEmpty() && partsEmail[0].matches("^[a-zA-Z0-9]+")) {
                return true;

            } else return false;

        } else {
            System.out.println("Данный 'email' не принадлежит сервису ");
            return false;
        }
    }


}
// Метод matches() — проверяет соответствие всей строки шаблону.
//"hello123".matches("[a-z0-9]+"); // true — только строчные и цифры
//"Hello".matches("[a-z]+");       // false — есть заглавная