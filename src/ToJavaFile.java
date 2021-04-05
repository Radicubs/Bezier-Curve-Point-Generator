import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.util.Scanner;

public class ToJavaFile {
    public static void main(String[] args) throws FileNotFoundException, UnsupportedEncodingException {
        PrintWriter writer = new PrintWriter("Slalom.java", "UTF-8");
        Scanner scanner = new Scanner(new File("Slalom.txt"));

        while(scanner.hasNextLine()){
            String line = scanner.nextLine();
            writer.println("slalomList.add(new CoordinatePair" + line + ");");
        }
    }
}
