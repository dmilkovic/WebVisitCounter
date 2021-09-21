import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.TreeMap;

public interface ViewCounter {

    public ArrayList<WebPageInterface> getSortedArray();

    public void setSortedArray(ArrayList<WebPageInterface> array);

    public void sort(Comparator<WebPageInterface> c);

    public void printValues();

    // private ArrayList<WebPageInterface> getSortedByUniqueCount(TreeMap<String, WebPageInterface> map) {
    //     ArrayList<WebPageInterface> ar = new ArrayList<WebPageInterface>();
    //     for (String key : map.keySet()) {
    //         ar.add(map.get(key));
    //     }

    //     Collections.sort(ar, new WebPageUniqueComparator());
    //     System.out.println("Sorted: ");
    //     return ar;
    // }

    // public static void sortCount(TreeMap<String, WebPageInterface> map) {
    //     ArrayList<WebPageInterface> ar = new ArrayList<WebPageInterface>();
    //     for (String key : map.keySet()) {
    //         ar.add(map.get(key));
    //     }
    //     Collections.sort(ar, new WebPageVisitsComparator());
    //     System.out.println("Sorted: ");
    //     for (WebPageInterface page : ar) {
    //         System.out.println(page.getWebPageName() + " " + page.getTotalCount());
    //     }

    //      System.out.println("Unique: ");
    //     Collections.sort(ar, new WebPageUniqueComparator());
    //     for (WebPageInterface page : ar) {
    //         System.out.println(page.getWebPageName() + " " + page.getUniqueCount());
    //     }
    // }
}
