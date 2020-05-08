package BFS_DFS_search;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Stack;

/*
 * ОБХОД В ГЛУБИНУ
 * 
 * Depth First Search(DFS)
 * 
 * классы: DFS, Graphs
 * 
 * Заносим false(непосещенный) узел в очередь
 * Делаем узел true(посещенным)
 * У последнего true узла выбираем смежный false узел и делаем его true
 * Если такого узла нет, ищем его у предпоследнего узла и тд
 * Повторяем, пока все вершины не станут true
 * 
 */

public class DFS {
	
	public static void Search(ArrayList<Integer>[] arrayGraphs) {
		
		System.out.println("--------------------------------------");
		
		boolean[] arraVertex = new boolean[arrayGraphs.length];//массив узлов, если узел посещен -  он true
				
		Stack<Integer> stack = new Stack<>();//стек
		
		stack.push(0);//заносим первый узел в стек
		
		arraVertex[stack.firstElement()] = true;//делаем первый узел true

		System.out.println(Arrays.toString(arraVertex));	

		while(!stack.empty()) {//пока стек не пустой
			
			int unit = stack.pop();//вынимаем первый узел из стека

			for(int j = 0; j < arrayGraphs[unit].size(); j++) {//перебор смежных узлов
				
				if(!arraVertex[arrayGraphs[unit].get(j)]) {//если смежный узел не true 

					stack.push(arrayGraphs[unit].get(j));//помещаем смежный узел в стек
					
					arraVertex[arrayGraphs[unit].get(j)] = true;//делаем смежный узел true
				}
			}
			
			System.out.println(stack);	

			System.out.println(Arrays.toString(arraVertex));	
			
		}
	}
}