import java.util.LinkedHashMap;
import java.util.TreeMap;

public class DataCollector {
    public DataCollector(String inputData) {
        this.inputData = inputData;
    }

    private String inputData;
    TreeMap<String, Webpage> hm = new TreeMap   <String, Webpage>();

    public void parseData() {
        String lines[] = inputData.split("\\r?\\n");
        System.out.println("lines size: " + lines.length);
        for (String string : lines) {
            // System.out.println("Parse " + string);
            // String s[] = string.split("(?:[0-9]{1,3}\\.){3}[0-9]{1,3}");
            String s[] = string.split("\\s+");
            //System.out.println("s legnth " + s.length);
            if (s.length == 2) {
                String websiteName = "";
                String userAddress = "";
                String s1 = s[0];
                String s2 = s[1];
                // for (String string2 : s) {
                if (s2.matches("(?:[0-9]{1,3}\\.){3}[0-9]{1,3}")) {
                    userAddress = s2;
                } 
                websiteName = s1;
               // System.out.println("Address  " + s1 + " " + s2);
                if (!websiteName.isEmpty() && !userAddress.isEmpty()) {
                   // System.out.println("Not empty" + websiteName + " " + userAddress);
                    if (hm.containsKey(websiteName)) {
                        hm.get(websiteName).addVisitor(userAddress);
                        System.out.println("add user " + userAddress);
                    } else {
                        hm.put(websiteName, new Webpage(websiteName, userAddress));
                        //hm.get(websiteName).addVisitor(userAddress);
                    }
                } else {
                    System.out.println("ERROR: Invalid data");
                }
            }else{
                System.out.println("ERROR: Invalid data format");
            }
        }
    }

    public void getCount() {
        for (String s : hm.keySet()) {
            System.out.println(hm.get(s).getName());
            hm.get(s).writeUsers();
        }
        System.out.println("Size: " + hm.size());
        System.out.println("Total count " + Webpage.totalCount);
        ViewCounter.getViewCount(hm);
    }
}
