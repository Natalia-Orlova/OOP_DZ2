package lesson2.Document;

public class TextDocument {

    String name;
    float grade;
    StringBuilder sb;
    public TextDocument() {
        sb = new StringBuilder();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getGrade() {
        return grade;
    }

    public void setGrade(float grade) {
        this.grade = grade;
    }
//    public TextFormat(String data) {
//        this();
//        addAllText(data);
//    }

//    public void addAllText(String text) {
//        sb.append(text + "\n");
//    }

    public void addAllText(String name, float grade) {
        sb.append(this.name + this.grade + "\n");
    }

//    public void addAllLines(String[] lines) {
//        for (String line : lines) {
//            addAllText(line);
//        }
//    }

    public String getData() {
        return sb.toString();
    }

    public void SaveAs(TextDocument documents, String path) {
    }
}
