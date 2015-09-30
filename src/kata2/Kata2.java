package kata2;

import java.util.HashMap;

public class Kata2 {
    
    
    public static void main(String[] args) {
        Integer[] vector = {2,2,11,4,2,6,11,2,3,5,11,5};
        String[] vector1 ={"Ana","Juan","Pedro","Ana","Juan","Pedro","Ana","Juan","Pedro","Ana","Juan","Pedro"};
        
        Histogram miHisto = new Histogram(vector);
        HashMap<Integer,Integer> histograma = miHisto.getHisto();
        
        System.out.println(histograma);
        
        miHisto = new Histogram(vector1);
        histograma = miHisto.getHisto();
        
        System.out.println(histograma);
    }
}
