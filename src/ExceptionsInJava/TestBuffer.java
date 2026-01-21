package ExceptionsInJava;

import javax.imageio.IIOException;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class TestBuffer {
    public static void main(String[] args) {
        try( BufferedReader reader = new BufferedReader(new FileReader("Example.txt"))) {
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println("IOException caught: " + e.getMessage());
        }
    }
}

