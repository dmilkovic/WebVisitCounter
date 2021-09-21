import java.util.TreeMap;

public class WebpageVisitCounter {
    String filePath;
    FileOpener fileOpener; 
    TreeMap<String, WebPageInterface> webpagesMap = new TreeMap<String, WebPageInterface>();

    public WebpageVisitCounter(String filePath) {
        this.filePath = filePath;
        fileOpener = new FileOpener("/home/drazen/CodeParser/webserver.log");
        this.openFile();
        this.getCount();  
    }

    public void openFile(){
        DataCollector d = new DataCollector(FileReader.readFromFile(fileOpener.f));
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
