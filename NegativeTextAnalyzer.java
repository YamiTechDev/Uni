public class NegativeTextAnalyzer implements TextAnalyzer {
    @Override
    public Label processText(String text) {
        if (text.contains(":(")) {
            return Label.NEGATIVE_TEXT;
        }
        return Label.OK;
    }
}