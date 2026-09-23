public class IsPalindrome {
    public static void main(String[] args) {
        String text = "Аргентина манит негра";
        isPalindrome(text);
    }

    static void isPalindrome(String text) {
        if (text.isBlank()) {
            System.out.println("Строка или пустая или содержит только пробелы поэтому не является Палиндромом");
        } else {
            String textNoReversed = text.toLowerCase().replaceAll("\\s+", "");// методами строки приводим текст к нижнему регистру и убираем пробелы
            String textReversed = new StringBuilder(textNoReversed).reverse().toString();//реверсом переворачиваем строку и сохраняем ее в новую перерменную
            boolean result = textNoReversed.equals(textReversed);// сравниваем содержимое до и после переворота, если да, то это Палиндром
            // можно использовать equalsIgnoreCase() сравнения без учёта регистра

            if (result) {
                System.out.println(text + "!!! Является Палиндромом");
            } else {
                System.out.println(text + "!!! Не является Палиндромом");
            }
        }

    }
}

