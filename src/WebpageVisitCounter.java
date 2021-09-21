import java.util.TreeMap;

public class WebpageVisitCounter {
    String filePath;
    ServerLogHandler fileHandler; 
    TreeMap<String, WebPageInterface> webpagesMap = new TreeMap<String, WebPageInterface>();

    public WebpageVisitCounter(String filePath) throws Exception {
        this.filePath = filePath;
        fileHandler = new WebServerLogFileHandler("/home/drazen/CodeParser/webserver.log");
        this.openFile();
        this.getCount();  
    }

    public void openFile() throws Exception{
        fileHandler.openFile();
        WebPageIterable d = new DataCollector(fileHandler.readFromFile());
        this.webpagesMap = d.parseData();
    }

    public void getCount() {
        for (String s : webpagesMap.keySet()) {
            System.out.println(webpagesMap.get(s).getWebPageName());
            webpagesMap.get(s).printOutUsers();
        }
        System.out.println("Size: " + webpagesMap.size());
        System.out.println("Total count: " + Webpage.totalCount);
        ViewCounter.getViewCount(webpagesMap);
    }

}
