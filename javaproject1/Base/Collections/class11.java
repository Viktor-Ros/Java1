package Collections;


import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class class11 {

    public static void main(String[] args) {
        Map<String, Object> map = new HashMap<>();
        map.put("Sim", 5);
        map.put("Tom", 5.5);
        map.put("Arbus", false);
        map.put("Baby", null);
        map.put("Cat", "Cat");
        map.put("Eat", new Long(56));
        map.put("Food", new Character('3'));
        map.put("Gevey", '6');
        map.put("Hugs", 111111111111L);
        map.put("Comp", (double) 123);

    	Iterator<Entry<String, Object>> iter = map.entrySet().iterator();//OBJECT - ?????
    	
    	while(iter.hasNext()) {
    		Entry<String, Object> it = iter.next();//разобрать
    		System.out.println(it.getKey() + " - " + it.getValue());
    		
    	}
    }
}
