public class WebPageUnique extends Webpage{

    public WebPageUnique(String name) {
        super(name);
    }

    
    public void addVisitor(String address) {
       // totalCount++;
        count++;
        if (!(this.visitors.contains(address)))
            this.visitors.add(address);
    }
}
