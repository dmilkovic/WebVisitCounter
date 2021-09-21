import java.util.Vector;

public class Webpage implements WebPageInterface{
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

    public String getWebPageName(){
        return this.name;
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

    public void printOutUsers() {
        for (String s : visitors) {
            System.out.println("User address: " + s);
        }
        countUsers();
    }

    public int getUniqueCount() {
        return this.visitors.size();
    }

    public int getTotalCount(){
        return this.count;
    }

    public void countUsers() {
        System.out.println("Number of visitors: " + visitors.size());
        System.out.println("Total visits: " + this.count);
    }

}
