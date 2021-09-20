import java.util.ArrayList;
import java.util.Collections;
import java.util.TreeMap;

public class ViewCounter {

    public static void getViewCount(TreeMap<String, Webpage> map) {
        ArrayList<Webpage> ar = new ArrayList<Webpage>();
        for (String key : map.keySet()) {
           ar.add(map.get(key));
        }
        Collections.sort(ar, new WebPageVisitsComparator());
        System.out.println("Sorted: ");
        for (Webpage page : ar) {
            System.out.println(page.name + " " + page.count);
        }

        System.out.println("Unique: ");
        Collections.sort(ar, new WebPageUniqueComparator());
                for (Webpage page : ar) {
            System.out.println(page.name + " " + page.getVisitorsSize());
        }        
    }
}
