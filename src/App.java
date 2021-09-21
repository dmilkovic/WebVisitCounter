public class App {
    public static void main(String[] args) throws Exception {
        if (args.length == 1) {
            if (args[0].toString().contains("path=")) {
                String path = args[0].toString().substring(5);
                WebpageVisitCounter visitCounter = new WebpageVisitCounter(path);
            } else {
                throw new Exception("Invalid path");
            }
        } else {
            throw new Exception("No valid config");
        }
    }
}
