package lesson2.Document;

public class TextFormat {

    StringBuilder sb;
    public TextFormat() {
        sb = new StringBuilder();
    }

    public TextFormat(String data) {
        this();
        addAllText(data);
    }

    public void addAllText(String text) {
        sb.append(text + "\n");
    }

    public void addAllLines(String[] lines) {
        for (String line : lines) {
            addAllText(line);
        }
    }

    public String getData() {
        return sb.toString();
    }

    public void SaveAs(TextFormat documents, String path) {
    }
}
