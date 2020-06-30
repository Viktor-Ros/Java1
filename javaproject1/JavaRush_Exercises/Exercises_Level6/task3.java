package Exercises_Level6;


import java.util.ArrayList;

/*
 * 
 * Метод fix должен:
 * 1. удалять из списка строк все слова, содержащие букву "р"
 * 2. удваивать все слова содержащие букву "л".
 * 3. если слово содержит и букву "р" и букву "л", то оставить это слово без изменений.
 * 4. с другими словами ничего не делать.
 * 
 */

public class task3 {

	public static void main(String[] args) throws Exception {
		
        ArrayList<String> strings = new ArrayList<String>();
        strings.add("роза");
        strings.add("лоза");
        strings.add("лира");
        strings.add("рррр");
        strings.add("ллл");

        strings = fix(strings);

        for (String string : strings) {
            System.out.println(string);
        }
    }

    public static ArrayList<String> fix(ArrayList<String> strings) { 
    	
        ArrayList<String> stringsR = new ArrayList<String>();
        ArrayList<String> stringsL = new ArrayList<String>();
    	
        for (String string : strings) {
        	
           if(string.indexOf("р") != -1 && string.indexOf("л") == -1) {//если Р есть Л нет
        	   stringsR.add(string);       	   
           }
           
           if(string.indexOf("л") != -1 && string.indexOf("р") == -1) {//если Л есть Р нет
        	   stringsL.add(string);  
           }
        }

    	strings.removeAll(stringsR);
    	strings.addAll(stringsL);
        
        return strings;
    }
}