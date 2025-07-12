// printing value that is equal to its frequency



import java.util.*;

class h2 {
    public static void main(String[] args) {
        List<Integer> l1 = new ArrayList<>();
        l1.add(1);
        l1.add(2);
        l1.add(1);
        l1.add(2);
        l1.add(3);
        l1.add(4);
        l1.add(3);
        l1.add(3);
        HashMap<Integer, Integer> h1 = new HashMap<>();
        for (var it : l1) {
            if (h1.get(it) == null) {
                h1.put(it, 1); 
            } else {
                int element = h1.get(it);
                h1.put(it, element + 1); 
            }
        }

        for (var it : h1.entrySet()) {  
            if (it.getKey()==it.getValue()) { 
                System.out.println(it.getKey());
            }
        }
    }
}