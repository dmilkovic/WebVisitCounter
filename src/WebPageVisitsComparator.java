// Java program to demonstrate working of Comparator
// interface
import java.util.*;
public class WebPageVisitsComparator implements Comparator<WebPageInterface>  {

        // Used for sorting in ascending order of
        // roll number
        public int compare(WebPageInterface a, WebPageInterface b)
        {
            return  b.getTotalCount() - a.getTotalCount();
        }
    
}