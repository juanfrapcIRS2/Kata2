package kata2;

import java.util.HashMap;

public class Kata2 {
    
    
    public static void main(String[] args) {
        Integer[] vector = {2,2,11,4,2,6,11,2,3,5,11,5};
        
        Histogram <Integer> histograma =  CalculaHistograma.calcHisto(vector);

        for (Object key : histograma.keySet()) {
            System.out.println(key + "->" + histograma.get(key));
        }
        
        System.out.println(histograma);
    }
}
