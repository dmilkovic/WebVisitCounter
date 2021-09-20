import java.util.TreeMap;

public class DataCollector {
    private String inputData;
    TreeMap<String, Webpage> hm = new TreeMap<String, Webpage>();

    public DataCollector(String inputData) {
        this.inputData = inputData;
    }

    public  TreeMap<String, Webpage> parseData() {
        InputParser inputParser = new InputParser(inputData);
        for (String s : inputParser.breakOnNewLine()) {
            String webSiteAndAddress[] =  inputParser.getWebsiteAndAddress(s);
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

    public void validateMap(){
        if(hm.size() == 0) throw new Error("Invalid file format!"); 
    }


}
