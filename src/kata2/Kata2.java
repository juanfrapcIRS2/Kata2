package kata2;

import java.util.HashMap;

public class Kata2 {
    
    
    public static void main(String[] args) {
        int[] vector = {2,2,11,4,2,6,11,2,3,5,11,5};
        
        Histogram miHisto = new Histogram(vector);
        HashMap<Integer,Integer> histograma = miHisto.getHisto();
        
        System.out.println(histograma);
        
        System.out.println(histograma);
    }
}
