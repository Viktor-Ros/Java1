package BFS_DFS_search;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Stack;

/*
 * 
 * Заносим узел в очередь
 * Делаем узел true
 * Заносим в очередь потомков
 * Удаляем узел
 * 
 * 
 */


public class BFS {
	
	public static void BFS(ArrayList<Integer>[] arr) {//Обход в ширину
		
		boolean[] ar = new boolean[arr.length];//массив узлов, если узел посещен -  он true
				
		ArrayDeque<Integer> list = new ArrayDeque<Integer>();//очередь
			
		list.add(0);//заносим первый узел в начало очереди
		
		ar[list.getFirst()] = true;//делаем первый узел из очереди true

		while(!list.isEmpty()) {//цикл работает пока очередь не пустая
			
			int a = arr[list.getFirst()].size();//кол-во смежных узлов первого узла из очереди
			
			for(int i = 0; i < a; i++) {//перебираем смежные узлы первого узла из очереди
				
				int b = arr[list.getFirst()].get(i);//смежный узел первого узла из очереди
				
				if(ar[b] == false) {//если узел не true
				
					list.addLast(b);//добавляем узел в конец очереди
					
					ar[b] = true;//делаем узел true
				}
			}
			
			list.removeFirst();//удаляем первый узел из очереди
			
			System.out.println(Arrays.toString(ar));

			System.out.println(list);

		}
	}	
}