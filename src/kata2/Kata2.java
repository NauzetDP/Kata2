
package kata2;

import java.util.HashMap;
import java.util.Map;

public class Kata2 {

    public static void main(String[] args) {
        Integer [] data = {9, 2, 3, 4, 5, 8, 1, 2, 3, 9, 5, 3, 6, 2, 7, 3, 6, 0};
        
        Histogram histogram = new Histogram(data);
        
        Map<Integer,Integer> histogr = histogram.getHistogram();
        
        for (Map.Entry<Integer, Integer> entry: histogr.entrySet()) {
            System.out.println(entry.getKey() + " ==> " + entry.getValue());
        }
    }
    
}
