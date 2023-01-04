package lesson2.Format;

import lesson2.Document.TextDocument;

import java.io.FileWriter;
import java.io.IOException;

public class Json extends TextDocument {
    public void SaveAs(TextDocument document, String path) {
        try (FileWriter writer = new FileWriter(path + ".json", false)) {
            writer.write("{ \n" + "\"" + document.getName() + "\":" + document.getGrade() + "\n");
            writer.write("}");
            writer.flush();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
