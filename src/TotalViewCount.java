import java.util.ArrayList;
import java.util.Comparator;
import java.util.TreeMap;
import java.util.Collections;

public class TotalViewCount implements WebPageSorter {
    private ArrayList<SortableWebPage> values;

    public TotalViewCount(TreeMap<String, SortableWebPage> map) {
        this.values = new ArrayList<SortableWebPage>(map.values());
    }

    @Override
    public ArrayList<SortableWebPage> getSortedArray() {
        return values;
    }

    @Override
    public void setSortedArray(ArrayList<SortableWebPage> array) {
        this.values = array;
    }

    @Override
    public void sort(Comparator<SortableWebPage> c) {
        Collections.sort(values, c);
    }

    @Override
    public void printValues() {

        for (SortableWebPage page : values) {
            System.out.println(page.getWebPageName() + " " + page.getUniqueCount());
        }
    }

}
