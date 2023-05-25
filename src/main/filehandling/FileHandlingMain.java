package main.filehandling;


import java.io.ByteArrayInputStream;
import java.io.InputStream;

public class FileHandlingMain {
    public static void main(String[] args) {
        String str = "Hi there, How are you ?\n I am fine.What about you?\n Doing Great.";
        InputStream stream = new ByteArrayInputStream(str.getBytes());
    }
}
