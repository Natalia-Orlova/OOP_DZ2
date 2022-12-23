package lesson2.Format;

import lesson2.Document.TextFormat;

import java.io.FileWriter;
import java.io.IOException;

public class Json extends TextFormat {
    public void SaveAs(TextFormat studentsList, String path) {
        try (FileWriter writer = new FileWriter(path + ".json", false)) {
            writer.write("'JSON': format \n");
            writer.write(studentsList.getData());
            writer.flush();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
