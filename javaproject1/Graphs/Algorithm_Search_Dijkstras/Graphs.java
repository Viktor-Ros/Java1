package Algorithm_Search_Dijkstras;

import java.util.ArrayList;

/*
 * 
 *		  ГРАФ
 * 		5------4
 * 	   / \	    \
 *    /   \      \
 *   0-----2------3
 * 	  \			  /
 *      \ 		/
 * 		  \	  /
 *          1
 * 
 *  0 => 1 = 20
 *  0 => 5 = 10
 *  1 => 3 = 30
 *  2 => 5 = 40
 *  2 => 0 = 20
 *  3 => 4 = 10
 *  3 => 2 = 20
 *  5 => 4 = 40
 *  
 */

public class Graphs {
		
	public static void main(String[] args) {
		
		ArrayList<Integer>[] graph = new ArrayList[6];

		for(int i = 0; i < graph.length; i++) {
			
			graph[i] = new ArrayList<Integer>();
			
			for(int j = 0; j < graph.length; j++) {
				
				graph[i].add(1000);
			}
		}
		
		graph[0].set(1,20);
		graph[0].set(5,10);
		graph[1].set(3,30);
		graph[2].set(0,20);
		graph[2].set(5,40);
		graph[3].set(2,20);
		graph[3].set(4,10);
		graph[5].set(4,40);
		
		for(int i = 0; i < graph.length; i++) {
			
			System.out.println(graph[i]);	
		}
		
		Dijkstras.Search(graph, 0);
		
	}
}
