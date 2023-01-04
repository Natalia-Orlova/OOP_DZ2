package lesson2.Interface;

import lesson2.Document.TextDocument;

public interface Saveable {
    void SaveAs(TextDocument document, String path);
}
