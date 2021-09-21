import java.io.File;
import java.io.FileInputStream;

public class WebServerLogFileHandler implements ServerLogHandler {
    public File f;
    boolean isValid = false;
    String fileSource;

    public WebServerLogFileHandler(String source) {
        this.fileSource = source;
    }

    @Override
    public void openFile() throws Exception {
        try {
            this.f = new File(fileSource);
            if (this.f.exists()) {
                isValid = true;
            } else {
                throw new Exception("ERROR: File doesn't exist: " + fileSource);
            }
        } catch (Exception e) {
            throw new Exception(e);
        }
    }

    @Override
    public String readFromFile() throws Exception {
        String output = "";
        try {
            FileInputStream fis = new FileInputStream(this.f);
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
