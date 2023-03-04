package Lectures.oop_lec2.Ex006.Interface;

import Lectures.oop_lec2.Ex006.Document.TextDocument;

public interface Saveable {
    void SaveAs(TextDocument document, String path);
}
