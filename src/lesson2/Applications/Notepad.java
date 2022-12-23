package lesson2.Applications;

import lesson2.Document.TextFormat;

import java.util.ArrayList;
import java.util.List;

public class Notepad {
    private List<TextFormat> documents;
    private int index;

    public Notepad() {
        documents = new ArrayList<>();
        index = -1;
    }

    public void newFile() {
        documents.add(new TextFormat());
        index++;
    }

    public TextFormat currentDocument() {
        return documents.get(index);
    }

    public void SaveAs(String path, TextFormat format) {
        format.SaveAs(documents.get(index), path);
    }
}
