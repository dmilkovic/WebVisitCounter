import java.util.TreeMap;

public class DataCollector {
    public DataCollector(String inputData) {
        this.inputData = inputData;
    }

    private String inputData;
    TreeMap<String, Webpage> hm = new TreeMap<String, Webpage>();

    public void parseData() {
        String lines[] = inputData.split("\\r?\\n");
        for (String string : lines) {
            String s[] = string.split("\\s+");
            if (s.length == 2) {
                String websiteName = "";
                String userAddress = "";
                String s1 = s[0];
                String s2 = s[1];
                if (s2.matches("(?:[0-9]{1,3}\\.){3}[0-9]{1,3}")) {
                    userAddress = s2;
                }
                websiteName = s1;
                if (!websiteName.isEmpty() && !userAddress.isEmpty()) {
                    if (hm.containsKey(websiteName)) {
                        hm.get(websiteName).addVisitor(userAddress);

                    } else {
                        hm.put(websiteName, new Webpage(websiteName, userAddress));
                    }
                } else {
                    System.out.println("ERROR: Invalid data");
                }
            } else {
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
