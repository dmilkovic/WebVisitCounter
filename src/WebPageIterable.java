import java.util.TreeMap;

public interface WebPageIterable {
    public TreeMap<String, WebPageInterface> parseData();
    public void validateMap();
}
