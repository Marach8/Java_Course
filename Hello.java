package Java_Course;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Hello {
    public static void main(String [] args) throws IOException {

        final InputStreamReader reader = new InputStreamReader(System.in);
        final BufferedReader bufferedReader = new BufferedReader(reader);
        final var name = bufferedReader.readLine();
        String fullName = "Your name is " + name;
        System.out.println(fullName);
    }
}
