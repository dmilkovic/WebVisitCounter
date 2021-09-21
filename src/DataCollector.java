import java.util.TreeMap;

public class DataCollector implements WebPageIterable {
    private String inputData;
    private TreeMap<String, SortableWebPage> hm = new TreeMap<String, SortableWebPage>();

    public DataCollector(String inputData) {
        this.inputData = inputData;
    }

    @Override
    public TreeMap<String, SortableWebPage> parseData() {
        InputParser inputParser = new InputParser(inputData);
        for (String s : inputParser.breakOnNewLine()) {
            String webSiteAndAddress[] = inputParser.getWebsiteAndAddress(s);
            String website = webSiteAndAddress[0];
            String userAddress = webSiteAndAddress[1];
            if (!website.isEmpty() && !userAddress.isEmpty()) {
                if (hm.containsKey(website)) {
                    hm.get(website).addVisitor(userAddress);
                } else {
                    hm.put(website, new Webpage(website, userAddress));
                }
            } else {
                System.out.println("ERROR: Invalid data");
            }
        }
        this.validateMap();
        return hm;
    }

    @Override
    public void validateMap() {
        if (hm.size() == 0)
            throw new Error("Invalid file format!");
    }

}
