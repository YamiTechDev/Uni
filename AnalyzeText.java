public class AnalyzeText {
    public Label[] analyzeText(TextAnalyzer[] analyzers, String text) {
        Label[] labels = new Label[analyzers.length];
        for (int i = 0; i < analyzers.length; i++) {
            labels[i] = analyzers[i].processText(text);
        }
        return labels;
    }

}
