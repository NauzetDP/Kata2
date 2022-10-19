package kata2;

import java.util.HashMap;
import java.util.Map;

public class Histogram<T> {
    
    private final T[] data;
    
    public Histogram (T[] data) {
        this.data = data;
    }
    
    public T[] getData () {
        return this.data;
    }
    
    public Map<T,Integer> getHistogram() {
        Map<T,Integer> histogram = new HashMap<T, Integer>();
        for (int i = 0; i < this.data.length; i++) {
            histogram.put(this.data[i], histogram.containsKey(this.data[i])
                                   ? histogram.get(this.data[i]) + 1 : 1);
        }
        return histogram;
    }
}