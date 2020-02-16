package Exercises_Level7;

/*
 * 
 * 1. Создай список слов, заполни его самостоятельно.
 * 2. Метод fix должен:
 * 2.1. удалять из списка строк все слова, содержащие букву "р"
 * 2.2. удваивать все слова содержащие букву "л".
 * 2.3. если слово содержит и букву "р" и букву "л", то оставить это слово без изменений.
 * 2.4. с другими словами ничего не делать.
 * 
 */

import java.util.ArrayList;
import java.util.Scanner;


public class task1 {

	
	public static void main(String[] args) throws Exception {
		

        ArrayList<String> strings = new ArrayList<String>();
        strings.add("роза");
        strings.add("лоза");
        strings.add("лира");
        strings.add("ррр");
        strings.add("ллл");

        strings = fix(strings);

        for (String string : strings) {
            System.out.println(string);
        }
    }
	
    public static ArrayList<String> fix(ArrayList<String> strings) { 
    
        ArrayList<String> stringsR = new ArrayList<String>();
        ArrayList<String> stringsL = new ArrayList<String>();
        
        for(int i = 0; i < strings.size(); i++) {
        	
        	if(strings.get(i).indexOf('л') >= 0 && strings.get(i).indexOf('р') < 0) {
        		stringsL.add(strings.get(i));
        	}
        	
        	if(strings.get(i).indexOf('р') >= 0 && strings.get(i).indexOf('л') < 0) {
        		stringsR.add(strings.get(i));
        	}
        	
        }
        
    	strings.removeAll(stringsR);
    	strings.addAll(stringsL);
    	
        return strings;
        
    }
}
