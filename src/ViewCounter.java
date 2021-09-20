import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.SortedSet;
import java.util.TreeMap;
import java.util.TreeSet;

public class ViewCounter {

    public static void getViewCount(TreeMap<String, Webpage> map) {
        
        ArrayList<Webpage> ar = new ArrayList<Webpage>();
        for (String key : map.keySet()) {
           ar.add(map.get(key));
        }
        Collections.sort(ar, new WebPageVisitsComparator());
        System.out.println("Sorted ");
        for (Webpage page : ar) {
            System.out.println(page.name + " " + page.count);
        }

        System.out.println("Unique ");
        Collections.sort(ar, new WebPageUniqueComparator());
                for (Webpage page : ar) {
            System.out.println(page.name + " " + page.getVisitorsSize());
        }
        // TreeMap<String, Webpage> sortyByTotalView = new TreeMap<String, Webpage>(new Comparator<Map.Entry<String, Webpage>>() {
        //     @Override
        //     public int compare(Entry<String, Webpage> o1, Entry<String, Webpage> o2) {
        //      //   return o1.getValue().compareTo(o2.getValue());
        //         return o1.getVisitorsSize() - o2.getVisitorsSize();
        //     }
        // });


        
    }

    // SortedSet<Map.Entry<String, Webpage>> sortedset = new TreeSet<Map.Entry<String, Webpage>>(
    //         new WebPageVisitsComparator() {
    //             @Override
    //             public int compare(Map.Entry<String, Webpage> e1,
    //                     Map.Entry<String, Webpage> e2) {
    //                         return e1.getVisitorsSize() - e2.getVisitorsSize();
       
    //                         //return e1.count.compareTo(e2.count());
    //             }
    //         });




    // static <K, V extends Comparable<? super V>> SortedSet<Map.Entry<K, V>>
    // entriesSortedByValues(Map<K, V> map) {
    // SortedSet<Map.Entry<K, V>> sortedEntries = new TreeSet<Map.Entry<K, V>>(new
    // Comparator<Map.Entry<K, V>>() {
    // @Override
    // public int compare(Map.Entry<K, V> e1, Map.Entry<K, V> e2) {
    // int res = e1.getValue().compareTo(e2.getValue());
    // return res != 0 ? res : 1;
    // }
    // });
    // sortedEntries.addAll(map.entrySet());
    // return sortedEntries;
    // }

    static <K, V extends Comparable<? super V>> SortedSet<Map.Entry<K, V>> entriesSortedByTotalCount(Map<K, V> map) {
        SortedSet<Map.Entry<K, V>> sortedEntries = new TreeSet<Map.Entry<K, V>>(new Comparator<Map.Entry<K, V>>() {
            @Override
            public int compare(Map.Entry<K, V> e1, Map.Entry<K, V> e2) {
                int res = e1.getValue().compareTo(e2.getValue());
                return res != 0 ? res : 1;
            }
        });
        sortedEntries.addAll(map.entrySet());
        return sortedEntries;
    }

    static <K, V extends Comparable<? super V>> SortedSet<Map.Entry<K, V>> entriesSortedByValues(Map<K, V> map) {
        SortedSet<Map.Entry<K, V>> sortedEntries = new TreeSet<Map.Entry<K, V>>(new Comparator<Map.Entry<K, V>>() {
            @Override
            public int compare(Map.Entry<K, V> e1, Map.Entry<K, V> e2) {
                int res = e1.getValue().compareTo(e2.getValue());
                return res != 0 ? res : 1;
            }
        });
        sortedEntries.addAll(map.entrySet());
        return sortedEntries;
    }
}
