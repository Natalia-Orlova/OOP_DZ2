package lesson2.Format;

import lesson2.Document.TextDocument;

import java.io.FileWriter;
import java.io.IOException;

public class Xml extends TextDocument {
    public void SaveAs(TextDocument studentsList, String path) {
        try (FileWriter writer = new FileWriter(path + ".xml", false)) {
            writer.write("<?xml version = \"1.0\" encoding=\"utf-8\"?> \n");
            writer.write("<students>\n");
            writer.write("<student>\n");
            writer.write("<name>" + studentsList.getName() + "</name>\n");
            writer.write("<grade>" + studentsList.getGrade() + "</grade>\n");
            writer.write("</student>\n");
            writer.write("</students>");
            writer.flush();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }

}
