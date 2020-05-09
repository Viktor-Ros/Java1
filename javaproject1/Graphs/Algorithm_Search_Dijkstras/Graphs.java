package Algorithm_Search_Dijkstras;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.ArrayList;


public class Graphs {
		
	public static void main(String[] args) throws IOException {

        //URL url = new URL("http://www.algorithmsilluminated.org/datasets/problem9.8test.txt");
        URL url = new URL("http://www.algorithmsilluminated.org/datasets/problem9.8.txt");
        
        BufferedReader in = new BufferedReader(new InputStreamReader(url.openStream()));//поток чтения данных из url
        
        String b;//строка из url
        
        ArrayList<ArrayList<String>> str = new ArrayList<>();//список строк
        
        while((b = in.readLine()) != null) {//добавление строк в список без пробелов
        	
        	str.add(new ArrayList<String>());
        	
    		int count = 0;
    		
    		for(int i = 0; i < b.length(); i++) {
    			
    			
    			if(b.charAt(i) == '	') {
    				str.get(str.size() - 1).add(b.split("	")[count]);
    				count++;
    			}
    			
    			if(i == b.length() - 1 && b.charAt(i) != '	') {
    				str.get(str.size() - 1).add(b.split("	")[count]);
    			}
    		}	
        }

        in.close();
        
        System.out.println(str);
       
		ArrayList<Integer>[] arr = new ArrayList[str.size() + 1];//матрица смежности
		
		for(int i = 0; i < arr.length; i++) {
			
			arr[i] = new ArrayList<Integer>();
			
			for(int j = 0; j < arr.length; j++) {
				
				arr[i].add(100000);
			}
		}
		
	       System.out.println("-----------------------------------------------------");
		
		for(int i = 0; i < str.size(); i++) {//заполнение матрица смежности
						
			ArrayList<String> a = str.get(i);
			
			int c = Integer.parseInt(a.get(0));
	        
	        for(int j = 1; j < a.size(); j++) {
	        	
	        	String d = a.get(j);
	        	
	        	int b1 = Integer.parseInt(d.split(",")[0]);//смежная вершина
	        	int b2 = Integer.parseInt(d.split(",")[1]);//расстояние
	        	
	        	arr[c].set(b1, b2);
	        }

		}
		
		for(int i = 0; i < arr.length; i++) {
		
	        System.out.println(arr[i]);
		}

	    System.out.println("-----------------------------------------------------");          
        
	    Dijkstras.Search(arr, 1);

      }
}
