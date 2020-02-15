package Exercises_Level7;


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
    		
    		int r = 0;
    		int l = 0;
    		
        	for(int j = 0; j < strings.get(i).length(); j++) {		
        		
        		if(strings.get(i).charAt(j) == 'л') {
        			
        			l++;
        		}
    		
        		if(strings.get(i).charAt(j) == 'р') {
        			
        			r++;
        		}
        	}
        			if(r == 0 && l != 0) {
        				stringsL.add(strings.get(i));
        			}
        	
        			if(r != 0 && l == 0) {
        				stringsR.add(strings.get(i));
        			}
    	}
    	
 
    	strings.removeAll(stringsR);
    	strings.addAll(stringsL);
    	
        return strings;
        
    }
}


















