package lesson2.Interface;

import lesson2.Document.TextFormat;

public interface Saveable {
    void SaveAs(TextFormat document, String path);
}
