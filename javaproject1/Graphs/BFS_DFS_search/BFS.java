package BFS_DFS_search;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Stack;

/*
 * ОБХОД В ШИРИНУ
 * 
 * Breadth First Search(BFS)
 * 
 * классы: BFS, Graphs
 * 
 * Заносим false(непосещенный) узел в очередь
 * Делаем узел true(посещенным)
 * Заносим в очередь потомков
 * Удаляем узел
 * Повторяем, пока чередь не опустеет
 * 
 */


public class BFS {
	
	public static void Search(ArrayList<Integer>[] graph) {
		
		System.out.println("--------------------------------------");
		
		boolean[] arraVertex = new boolean[graph.length];//массив узлов, если узел посещен -  он true
				
		ArrayDeque<Integer> deque = new ArrayDeque<Integer>();//очередь
			
		deque.add(0);//заносим первый узел в начало очереди
		
		arraVertex[deque.getFirst()] = true;//делаем первый узел из очереди true

		System.out.println(Arrays.toString(arraVertex));

		while(!deque.isEmpty()) {//цикл работает пока очередь не пустая
			
			for(int i = 0; i < graph[deque.getFirst()].size(); i++) {//перебираем смежные узлы первого узла из очереди
				
				int vertex = graph[deque.getFirst()].get(i);//смежный узел первого узла из очереди
				
				if(arraVertex[vertex] == false) {//если узел не true
				
					deque.addLast(vertex);//добавляем узел в конец очереди
					
					arraVertex[vertex] = true;//делаем узел true
				}
			}
			
			deque.removeFirst();//удаляем первый узел из очереди
			
			System.out.println(deque);
			
			System.out.println(Arrays.toString(arraVertex));

		}
	}	
}