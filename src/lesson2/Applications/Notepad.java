package lesson2.Applications;

import lesson2.Document.TextDocument;
//import lesson2.Format.Json;

import java.util.ArrayList;
import java.util.List;

public class Notepad {
    private List<TextDocument> documents;
    private int index;

    public Notepad() {
        documents = new ArrayList<>();
        index = -1;
    }

    public void newFile() {
        documents.add(new TextDocument());
        index++;
    }

    public TextDocument currentDocument() {
        return documents.get(index);
    }

    public void SaveAs(String path, TextDocument format) {
        format.SaveAs(documents.get(index), path);
    }
}
