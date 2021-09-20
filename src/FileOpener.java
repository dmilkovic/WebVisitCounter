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

    // public static void main(String args[]) {
    //     try {
    //         // constructor of file class having file as argument
    //         File file = new File("/home/drazen/CodeParser/webserver.log");
    //         FileInputStream fis = new FileInputStream(file); // opens a connection to an actual file
    //         System.out.println("file content: ");
    //         int r = 0;
    //         while ((r = fis.read()) != -1) {
    //             System.out.print((char) r); // prints the content of the file
    //         }
    //     } catch (Exception e) {
    //         e.printStackTrace();
    //     }
    // }
}