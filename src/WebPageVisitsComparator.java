import java.util.*;
public class WebPageVisitsComparator implements Comparator<SortableWebPage>  {

        public int compare(SortableWebPage a, SortableWebPage b)
        {
            return  b.getTotalCount() - a.getTotalCount();
        }
    
}