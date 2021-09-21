import java.util.*;

public class WebPageUniqueComparator implements Comparator<SortableWebPage> {

    public int compare(SortableWebPage a, SortableWebPage b) {
        return b.getUniqueCount() - a.getUniqueCount();
    }

}