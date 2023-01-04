package lesson2.Format;

import lesson2.Document.TextDocument;

import java.io.FileWriter;
import java.io.IOException;

public class Txt extends TextDocument {
    public void SaveAs(TextDocument document, String path) {
        try (FileWriter writer = new FileWriter(path + ".txt", false)) {
            writer.write("txt format \n");
            writer.write(document.getName() + "=" + document.getGrade());
            writer.flush();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
