public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        System.out.println("Goodbye curel world!");
        TestClass t = new TestClass("Josko", 0);
        t.greet();

        if (args.length == 1) {
            if (args[0].toString().contains("path=")) {
                FileOpener a = new FileOpener("/home/drazen/CodeParser/webserver.log");
                if (a.isValid) {
                    System.out.println(FileReader.readFromFile(a.f));
                } else {
                    throw new Exception("Cant open file");
                }
                // FileReader.readFromFile(a.f);
            } else {
                throw new Exception("Invalid path");
            }
        }
        else {
            throw new Exception("No valid config");
        }
    }
}
