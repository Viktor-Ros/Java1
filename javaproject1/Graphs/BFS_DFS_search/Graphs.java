package BFS_DFS_search;

import java.util.ArrayList;
import java.util.Arrays;

public class Graphs {
	
	/*		ГРАФ
	 * 		5------4
	 * 	   / \	    \
	 *    /    \     \
	 *   0------2-----3
	 * 	  \			  /
	 *      \ 		/
	 * 		  \	  /
	 *          1
	 * 
	 */
		public static void main(String[] args) {
			 
			final String[][] ms = new String[6][6];
			
			for (int i = 0; i < 6; i++) {
		        for (int j = 0; j < 6; j++) {
		        	ms[i][j] = "-";
		        }
		    }
			
			ms[0][1] = "+";
			ms[0][2] = "+";
			ms[0][5] = "+";
			ms[1][0] = "+";
			ms[1][3] = "+";
			ms[2][0] = "+";
			ms[2][3] = "+";
			ms[2][5] = "+";
			ms[3][1] = "+";
			ms[3][2] = "+";
			ms[3][4] = "+";
			ms[4][3] = "+";
			ms[4][5] = "+";
			ms[5][0] = "+";
			ms[5][2] = "+";
			ms[5][4] = "+";
			
			
			/////////////////////////////////////////
			for (int i = 0; i < 6; i++) {
	        for (int j = 0; j < 6; j++) {
	          System.out.print(ms[i][j] + " ");
	   
	        }
	        System.out.println();
			}
			////////////////////////////////////////
			
			ArrayList<Integer>[] arr = new ArrayList[6];
			for(int i = 0; i < arr.length; i++) {
				arr[i] = new ArrayList<Integer>();
			}
			
			arr[0].add(1);
			arr[0].add(2);
			arr[0].add(5);
			arr[1].add(0);
			arr[1].add(3);
			arr[2].add(0);
			arr[2].add(3);
			arr[2].add(5);
			arr[3].add(1);
			arr[3].add(2);
			arr[3].add(4);
			arr[4].add(3);
			arr[4].add(5);
			arr[5].add(0);
			arr[5].add(2);
			arr[5].add(4);
			/////////////////////////////
			
			//ВТОРОЙ ГРАФ
			/*arr[0].add(1);
			arr[0].add(2);
			arr[0].add(5);
			arr[1].add(0);
			arr[1].add(3);
			arr[2].add(0);
			arr[2].add(6);
			arr[2].add(5);
			arr[3].add(1);
			arr[3].add(4);
			arr[4].add(3);
			arr[5].add(0);
			arr[5].add(2);
			arr[5].add(7);
			arr[6].add(2);
			arr[6].add(8);
			arr[7].add(5);
			arr[7].add(9);
			arr[7].add(10);
			arr[8].add(6);
			arr[9].add(7);
			arr[10].add(7);*/

	        System.out.println(Arrays.toString(arr));
	        			
			BFS.BFS(arr);//поиск в ширину
			
			DFS.DFS(arr);//поиск в глубину
				
		}	
	}