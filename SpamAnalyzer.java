public class SpamAnalyzer implements TextAnalyzer {
    private String[] keywords;

    public SpamAnalyzer(String[] keywords) {
        this.keywords = keywords;
    }

    @Override
    public Label processText(String text) {
        for (String word : keywords) {
            if (text.contains(word)) {
                return  Label.SPAM;
            }
        }
        return Label.OK;
    }
}