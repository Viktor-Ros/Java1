package BFS_DFS_search;

import java.util.ArrayList;
import java.util.Arrays;

/*		
 * 
 * 		ГРАФ №1
 * 		5------4
 * 	   / \	    \
 *    /   \      \
 *   0-----2------3
 * 	  \			  /
 *      \ 		/
 * 		  \	  /
 *          1
 *          
 *          
 *      ГРАФ №2
 *		    0
 *		  / | \
 *		 /  |  \   
 * 		/	|   \
 *     1	2	 5
 * 	   |	|	 |
 *     |	|	 |
 *     |	|	 |
 * 	   3	6	 7
 *     |	|	 /\
 *     |	|	/  \
 *     |	|  9   10
 * 	   4    8  
 * 
 * 
 */


public class Graphs {
	

		public static void main(String[] args) {
			
			ArrayList<Integer>[] graph1 = new ArrayList[6];
			for(int i = 0; i < graph1.length; i++) {
				graph1[i] = new ArrayList<Integer>();
			}
			
			graph1[0].add(1);
			graph1[0].add(2);
			graph1[0].add(5);
			graph1[1].add(0);
			graph1[1].add(3);
			graph1[2].add(0);
			graph1[2].add(3);
			graph1[2].add(5);
			graph1[3].add(1);
			graph1[3].add(2);
			graph1[3].add(4);
			graph1[4].add(3);
			graph1[4].add(5);
			graph1[5].add(0);
			graph1[5].add(2);
			graph1[5].add(4);

			System.out.println("ГРАФ №1");
			
			for(int i = 0; i < graph1.length; i++) {
				
				System.out.println(graph1[i]);	
			}
			
			System.out.println("--------------------------------------");
			
			ArrayList<Integer>[] graph2 = new ArrayList[11];
			for(int i = 0; i < graph2.length; i++) {
				graph2[i] = new ArrayList<Integer>();
			}
			
			graph2[0].add(1);
			graph2[0].add(2);
			graph2[0].add(5);
			graph2[1].add(0);
			graph2[1].add(3);
			graph2[2].add(0);
			graph2[2].add(6);
			graph2[2].add(5);
			graph2[3].add(1);
			graph2[3].add(4);
			graph2[4].add(3);
			graph2[5].add(0);
			graph2[5].add(2);
			graph2[5].add(7);
			graph2[6].add(2);
			graph2[6].add(8);
			graph2[7].add(5);
			graph2[7].add(9);
			graph2[7].add(10);
			graph2[8].add(6);
			graph2[9].add(7);
			graph2[10].add(7);

			System.out.println("ГРАФ №2");
			
			for(int i = 0; i < graph2.length; i++) {
				
				System.out.println(graph2[i]);	
			}
			
			System.out.println("--------------------------------------");	
	        
			BFS.Search(graph1);
			
			DFS.Search(graph1);
				
		}	
	}