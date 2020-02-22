package Exercises_Level8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

/*
 * 
 * 1. Создать словарь (Map<String, String>) 
 * 2. Занести в него десять записей по принципу "фамилия" - "имя".
 * 3. Удалить людей, имеющих одинаковые имена.
 * 
 * Использовать все методы класса, метод removeItemFromMapByValue - дефолтный
 * 
 */

public class task2 {

    public static Map<String, String> createMap() {
        //напишите тут ваш код
    	
        Map<String, String> map = new HashMap<>();
        
	    String a = "a";
		String b = "";
		
	for(int i = 0; i < 10; i++) {
	    b = b + a;
		map.put(b,"Витька");
	}      
        return map;
    }

    public static void removeTheFirstNameDuplicates(Map<String, String> map) {
        //напишите тут ваш код
       	
        Map<String, String> copy1 = new HashMap<>(map);
        Map<String, String> copy2 = new HashMap<>(map); 	    	

        for (Map.Entry<String, String> pair1 : copy1.entrySet()) {
        	for (Map.Entry<String, String> pair2 : copy2.entrySet()) {
        		if(pair1.getValue().equals(pair2.getValue()) && !pair1.getKey().equals(pair2.getKey())) {
                   // map.remove(pair2.getKey());// - удаление без removeItemFromMapByValue
                    removeItemFromMapByValue(map,pair2.getValue());
        		}   	
            }
        }
    }

    public static void removeItemFromMapByValue(Map<String, String> map, String value) {
    	
        Map<String, String> copy = new HashMap<>(map);
        
        for (Map.Entry<String, String> pair : copy.entrySet()) {
        	
            if (pair.getValue().equals(value)) {
            	
                map.remove(pair.getKey());
            }
        }
    }

    public static void main(String[] args) {

    }
}