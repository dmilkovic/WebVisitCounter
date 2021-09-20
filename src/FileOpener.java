import java.io.*;
public class FileOpener {

    public File f;
    boolean isValid = false;

    public FileOpener(String source){
        try {
            // constructor of file class having file as argument
            this.f = new File("/home/drazen/CodeParser/webserver.log");
            isValid = true;
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}