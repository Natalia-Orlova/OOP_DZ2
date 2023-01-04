package lesson2;

import lesson2.Applications.Notepad;
import lesson2.Format.Json;
import lesson2.Format.Txt;
import lesson2.Format.Xml;


public class Main {
    public static void main(String[] args) {
        Notepad notes = new Notepad();
        notes.newFile();

        notes.currentDocument().addAllText("Иван Иванов", 4.8f);
        notes.currentDocument().addAllText("Мария Кузнецова", 5.0f);
        notes.currentDocument().addAllText("Степан Кузьмин", 4.6f);


        notes.SaveAs("file1", new Json());
        notes.SaveAs("file2", new Xml());
        notes.SaveAs("file3", new Txt());

    }
}
