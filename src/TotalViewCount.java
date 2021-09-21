import java.util.ArrayList;
import java.util.Comparator;
import java.util.TreeMap;
import java.util.Collections;

public class TotalViewCount implements ViewCounter {
    private ArrayList<WebPageInterface> values;

    public TotalViewCount(TreeMap<String, WebPageInterface> map) {
        this.values = new ArrayList<WebPageInterface>(map.values());
    }

    @Override
    public ArrayList<WebPageInterface> getSortedArray() {
        return values;
    }

    @Override
    public void setSortedArray(ArrayList<WebPageInterface> array) {
        this.values = array;
    }

    @Override
    public void sort(Comparator<WebPageInterface> c) {
        Collections.sort(values, c);
    }

    @Override
    public void printValues() {

        for (WebPageInterface page : values) {
            System.out.println(page.getWebPageName() + " " + page.getUniqueCount());
        }
    }

}
