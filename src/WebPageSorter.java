import java.util.ArrayList;
import java.util.Comparator;

public interface WebPageSorter {
    public ArrayList<SortableWebPage> getSortedArray();

    public void setSortedArray(ArrayList<SortableWebPage> array);

    public void sort(Comparator<SortableWebPage> c);

    public void printValues();
}
