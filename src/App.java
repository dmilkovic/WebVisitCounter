public class App {
    public static void main(String[] args) throws Exception {
        WebpageVisitCounter visitCounter = new WebpageVisitCounter("/home/drazen/CodeParser/webserver.log");
        //visitCounter.openFile();
        // if (args.length == 1) {
        // if (args[0].toString().contains("path=")) {
        // FileOpener a = new FileOpener("/home/drazen/CodeParser/webserver.log");
        // if (a.isValid) {
        // // System.out.println(FileReader.readFromFile(a.f));
        // DataCollector d = new DataCollector(FileReader.readFromFile(a.f));

        // d.parseData();

        // } else {
        // throw new Exception("Cant open file");
        // }
        // // FileReader.readFromFile(a.f);
        // } else {
        // throw new Exception("Invalid path");
        // }
        // }
        // else {
        // throw new Exception("No valid config");
        // }
    }
}
