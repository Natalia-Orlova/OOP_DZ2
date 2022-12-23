package lesson2;

import lesson2.Applications.Notepad;
import lesson2.Format.Json;
import lesson2.Format.Xml;

public class Main {
    public static void main(String[] args) {
        Notepad notes = new Notepad();
        notes.newFile();
        notes.currentDocument().addAllText("text1");
        notes.currentDocument().addAllText("text2");
        notes.currentDocument().addAllText("text3");
        notes.SaveAs("file1", new Json());
        notes.SaveAs("file2", new Xml());
    }
}
