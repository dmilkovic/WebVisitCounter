import java.util.ArrayList;
import java.util.Collections;
import java.util.TreeMap;

public class ViewCounter {

    public static void getViewCount(TreeMap<String, WebPageInterface> map) {
        ArrayList<WebPageInterface> ar = new ArrayList<WebPageInterface>();
        for (String key : map.keySet()) {
           ar.add(map.get(key));
        }
        Collections.sort(ar, new WebPageVisitsComparator());
        System.out.println("Sorted: ");
        for (WebPageInterface page : ar) {
            System.out.println(page.getWebPageName() + " " + page.getTotalCount());
        }

        System.out.println("Unique: ");
        Collections.sort(ar, new WebPageUniqueComparator());
                for (WebPageInterface page : ar) {
            System.out.println(page.getWebPageName() + " " + page.getUniqueCount());
        }        
    }
}
