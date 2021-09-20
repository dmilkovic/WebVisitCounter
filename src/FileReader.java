import java.io.*;

public class FileReader {
    // sprivate File file;

    public static String readFromFile(File file) {
        String output = "";
        try {
            FileInputStream fis = new FileInputStream(file);
            // opens a connection to an actual file
            int r = 0;
            while ((r = fis.read()) != -1) {
                output += (char) r;
            }
            fis.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return output;
    }
}
