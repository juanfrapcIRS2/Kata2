package kata2;

import java.util.HashMap;

public class Histogram2 {

    private final int[] elVector;

    public Histogram2(int[] vector) {
        this.elVector = vector;
    }

    public int[] getVector() {
        return elVector;
    }
    
    public HashMap<Integer, Integer> getHisto(){
        HashMap <Integer, Integer> histograma = new HashMap();
        
        for (int i = 0; i < elVector.length; i++) {
            if (!histograma.containsKey(elVector[i])){
                histograma.put(elVector[i], 0);
            }
            histograma.put(elVector[i], histograma.get(elVector[i]+1));
        }
        return histograma;
        
    }
    
}
