package Algorithm_Search_Dijkstras;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.ArrayList;


public class Graphs {
		
	public static void main(String[] args) throws IOException {

        //URL url = new URL("http://www.algorithmsilluminated.org/datasets/problem9.8test.txt");//маленький граф
        URL url = new URL("http://www.algorithmsilluminated.org/datasets/problem9.8.txt");//большой граф
        
        BufferedReader in = new BufferedReader(new InputStreamReader(url.openStream()));//поток чтения данных из url
        
        String urlString;//строка из url
        
        ArrayList<ArrayList<String>> strArray = new ArrayList<>();//список строк
        
        while((urlString = in.readLine()) != null) {//добавление строк в список без пробелов
        	
        	strArray.add(new ArrayList<String>());
        	
    		int count = 0;
    		
    		for(int i = 0; i < urlString.length(); i++) {
    			
    			if(urlString.charAt(i) == '	') {
    				strArray.get(strArray.size() - 1).add(urlString.split("	")[count]);
    				count++;
    			}
    			
    			if(i == urlString.length() - 1 && urlString.charAt(i) != '	') {
    				strArray.get(strArray.size() - 1).add(urlString.split("	")[count]);
    			}
    		}	
        }

        in.close();
        
        System.out.println(strArray);
       
		ArrayList<Integer>[] graph = new ArrayList[strArray.size() + 1];//матрица смежности
		
		for(int i = 0; i < graph.length; i++) {
			
			graph[i] = new ArrayList<Integer>();
			
			for(int j = 0; j < graph.length; j++) {
				
				graph[i].add(1000000);
			}
		}
		
		for(int i = 0; i < strArray.size(); i++) {//заполнение матрица смежности
						
			ArrayList<String> strVertex = strArray.get(i);//узел и его смежные узлы в списке строк
			
			int vertex = Integer.parseInt(strVertex.get(0));//узел
	        
	        for(int j = 1; j < strVertex.size(); j++) {
	        	
	        	String vertexAndLength = strVertex.get(j);
	        	
	        	int graphVertex = Integer.parseInt(vertexAndLength.split(",")[0]);//смежная вершина
	        	int lengtVertex = Integer.parseInt(vertexAndLength.split(",")[1]);//расстояние
	        	
	        	graph[vertex].set(graphVertex, lengtVertex);
	        }
		}

       
	    //Dijkstras.Search(graph, 1);
	    DijkstrasPQ.Search(graph, 1);


      }
}