

/**
 * Created Stas Tetler
 */
public class Main {

    public static void main(String[] args) {
        String text = "See the news on you TV Rail disaster\n" +
                "Ever wonder why was he\n" +
                "Getting faster\n" +
                "Every time the red caboose\n" +
                "Takes a train\n" +
                "Seems to loose it's braking shoes\n" +
                "Can't explain (Stop that train)\n" +
                "\n" +
                "Wide smile, high style, that's me\n" +
                "Out front, in back, C.B.\n" +
                "Wrong side of the track C.B.\n" +
                "\n" +
                "See the news on you TV Rail disaster\n" +
                "Ever wonder why was he\n" +
                "Getting faster\n" +
                "Every time the red caboose\n" +
                "Takes a train\n" +
                "Seems to loose it's braking shoes\n" +
                "Can't explain (Stop that train)\n" +
                "\n" +
                "Wide smile, high style, that's me\n" +
                "Out front, in back, C.B.\n" +
                "Wrong side of the track C.B.\n" +
                "\n" +
                "Hiding at the back of the freight train\n" +
                "Unsupected\n" +
                "When they robbed the great train I collected\n" +
                "While the feds shake their heads\n" +
                "I'm on the loose\n" +
                "There each time at the scene of the crime\n" +
                "\n" +
                "The red caboose (Stop that train)\n" +
                "\n" +
                "Wide smile, high style, that's me\n" +
                "Out front, in back, C.B.\n" +
                "Wrong side of the track C.B.\n" +
                "\n" +
                "The state police they don't suspect\n" +
                "I got old ninety seven wrecked\n" +
                "Interpol don't know that I\n" +
                "Crossed the bridge on the river Kwai\n" +
                "Seems like any train that takes me\n" +
                "Just doesn't get the brakes\n" +
                "Somebody go fetch a cop\n" +
                "Another train just failed to stop (Brake that train)\n" +
                "\n" +
                "Wide smile, high style, that's me\n" +
                "Out front, in back, C.B.\n" +
                "Wrong side of the track C.B.\n" +
                "\n" +
                "Ten four Smokey bear\n" +
                "I could be anywhere\n" +
                "You know I'm to blame\n" +
                "But you don't know my name";

        String[] keywords = {"спам", "Smokey", "купи"};// создаю массив ключевых слов
        SpamAnalyzer spam = new SpamAnalyzer(keywords); // создаю обьект спаманалайзер
        NegativeTextAnalyzer negative = new NegativeTextAnalyzer(); // создаю объект анализатора
        TooLongTextAnalyzer tooLong = new TooLongTextAnalyzer(20);// создаю объект анализатора

        TextAnalyzer[] analyzers = { spam, negative, tooLong };// передаю обекты анализатора в массив т.к. наш метод принимет массив
        AnalyzeText checker = new AnalyzeText();
        Label[] labels = checker.analyzeText(analyzers, text);// запускаю метод с переданными параметрами
        for (Label label : labels) {
            System.out.println(label);


    }
}}