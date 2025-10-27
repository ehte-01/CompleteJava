package ExceptionsInJava;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class TestFileReader {
    public static void main(String[] args) throws IOException {
        method2();
    }

    public static void method2() throws FileNotFoundException {
        method1();
    }

    public static void method1() throws FileNotFoundException {
        try {
            FileReader filereader = new FileReader("a.txt");
        } catch (FileNotFoundException e) {
            System.out.println("FILE NOT FOUND");
            throw new FileNotFoundException("ops");

        }
    }
}
