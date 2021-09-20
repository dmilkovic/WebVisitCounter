import java.util.Vector;

public class Webpage {
    public static int totalCount = 0;
    public int count = 0;
    public String name;
    public Vector<String> visitors;

    public Webpage(String name) {
        this.name = name;
        this.visitors = new Vector<String>();
    }

    public Webpage(String name, String userAddress) {
        this.name = name;
        this.visitors = new Vector<String>();
        this.addVisitor(userAddress);
    }

    public void addVisitor(String address) {
        totalCount++;
        count++;
        if (!visitors.contains(address))
            visitors.add(address);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void writeUsers() {
        for (String s : visitors) {
            System.out.println("User address: " + s);
        }
        countUsers();
    }

    public int getVisitorsSize() {
        return this.visitors.size();
    }

    public void countUsers() {
        System.out.println("Number of visitors: " + visitors.size());
        System.out.println("Total visits: " + this.count);
    }

}
