import java.util.TreeMap;

public interface WebPageIterable {
    public TreeMap<String, SortableWebPage> parseData();
    public void validateMap();
}
