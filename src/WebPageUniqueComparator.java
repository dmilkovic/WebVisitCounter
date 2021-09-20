// Java program to demonstrate working of Comparator
// interface
import java.util.*;
public class WebPageUniqueComparator implements Comparator<Webpage>  {

        // Used for sorting in ascending order of
        // roll number
        public int compare(Webpage a, Webpage b)
        {
            return a.getVisitorsSize() - b.getVisitorsSize();
        }
    
}