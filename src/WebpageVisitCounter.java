import java.util.ArrayList;
import java.util.TreeMap;

public class WebpageVisitCounter {
    String filePath;
    ServerLogHandler fileHandler; 
    TreeMap<String, WebPageInterface> webpagesMap = new TreeMap<String, WebPageInterface>();

    private ViewCounter sorter;
    private ArrayList<WebPageInterface> sortedByTotalView;
    private ArrayList<WebPageInterface> sortedByUniqueView;

    public WebpageVisitCounter(String filePath) throws Exception {
        this.filePath = filePath;
        fileHandler = new WebServerLogFileHandler("/home/drazen/CodeParser/webserver.log");
        this.processFile();
        this.getCount();  
    }

    public void processFile() throws Exception{
        fileHandler.openFile();
        WebPageIterable d = new DataCollector(fileHandler.readFromFile());
        this.webpagesMap = d.parseData();
        this.sorter = new TotalViewCount(webpagesMap);
    }

    public void getCount() {
        for (String s : webpagesMap.keySet()) {
            System.out.println(webpagesMap.get(s).getWebPageName());
            webpagesMap.get(s).printOutUsers();
        }
        System.out.println("Size: " + webpagesMap.size());
        System.out.println("Total count: " + Webpage.totalCount);
      //s  ViewCounter.getViewCount(webpagesMap);
        this.sortbyTotalViews();
        this.sortbyUniqueViews();
        this.printTotalViews();
        this.printUniqueViews();
    }

    public void sortbyTotalViews(){
        sorter.sort(new WebPageVisitsComparator());
        sortedByTotalView = sorter.getSortedArray();
    }

    public void sortbyUniqueViews(){
        sorter.sort(new WebPageUniqueComparator());
        sortedByUniqueView = sorter.getSortedArray();
    }

    public void printTotalViews(){
       // System.out.println(sortedByTotalView);
       System.out.println("Sorted by total count: ");
        for(WebPageInterface page: sortedByTotalView)
        {
            System.out.println(page.getWebPageName() + " " + page.getTotalCount());
        }
    }

    public void printUniqueViews(){
      //  System.out.println(sortedByUniqueView);
      System.out.println("Sorted by unique count: ");
        for(WebPageInterface page: sortedByTotalView)
        {
            System.out.println(page.getWebPageName() + " " + page.getUniqueCount());
        }
    }
    

}
