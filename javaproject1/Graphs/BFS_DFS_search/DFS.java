package BFS_DFS_search;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Stack;

public class DFS {
	
	public static void DFS(ArrayList<Integer>[] arrayGraphs) {
		
		boolean[] arraySearch = new boolean[arrayGraphs.length];//массив узлов, если узел посещен -  он true
				
		Stack<Integer> stack = new Stack<>();
		
		stack.push(0);//заносим первый узел в стек
		
		arraySearch[stack.firstElement()] = true;//делаем первый узел true

		System.out.println(Arrays.toString(arraySearch));	

		while(!stack.empty()) {//пока стек не пустой
			
			int unit = stack.pop();//вынимаем первый узел из стека

			for(int j = 0; j < arrayGraphs[unit].size(); j++) {//перебор смежных узлов
				
				if(!arraySearch[arrayGraphs[unit].get(j)]) {//если смежный узел не true 

					stack.push(arrayGraphs[unit].get(j));//помещаем смежный узел в стек
					
					arraySearch[arrayGraphs[unit].get(j)] = true;//делаем смежный узел true
				}
			}
			
			System.out.println(stack);	

			System.out.println(Arrays.toString(arraySearch));	
			
		}
	}
}