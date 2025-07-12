//printing key of minimum frequency

import java.util.*;

class h4 {
    public static void main(String[] args) {
        List<Integer> l1 = new ArrayList<>();
        l1.add(1);
        l1.add(2);
        l1.add(1);
        l1.add(3);
        l1.add(3);
        l1.add(4);
        l1.add(4);
        l1.add(4);
        HashMap<Integer, Integer> h1 = new HashMap<>();
        for (var it : l1) {
            h1.put(it,h1.getOrDefault(it,0)+1);
        }
        int minFreq=h1.get(1);
        for(var it:h1.entrySet())
        {
            if(it.getValue()<minFreq)
            {
                minFreq=it.getKey();

            }
        }
        System.out.println(minFreq);
    }
}
