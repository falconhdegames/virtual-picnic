import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Input {
    public String text;
    public String[] splitted;
    public Input(String filename) {
        try(Scanner in = new Scanner(new FileReader(filename));) {
            StringBuilder sb = new StringBuilder();
            while (in.hasNext()) {sb.append(in.next());}
            in.close();
            text = sb.toString();
            splitted = text.split(" ");
        }
        catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
