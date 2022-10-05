package kata2;

import java.util.HashMap;
import java.util.Map;

public class Histogram {
    
    private final int [] data;
    
    public Histogram (int[] data) {
        this.data = data;
    }
    
    public int [] getData () {
        return this.data;
    }
    
    public Map<Integer,Integer> getHistogram() {
        Map<Integer,Integer> histogram = new HashMap<Integer, Integer>();
        for (int i = 0; i < this.data.length; i++) {
            histogram.put(this.data[i], histogram.containsKey(this.data[i]) 
                                   ? histogram.get(this.data[i]) + 1 : 1);
        }
        return histogram;
    }
}