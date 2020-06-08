package Algorithm_Search_Dijkstras;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;


/*
 * 
 * АЛГОРИТМ ДЕЙКСТРЫ C ОЧЕРЕДЬЮ
 * 
 * поиск выполняется за O(n*logn + m), где n — кол-во вершин, m — кол-во рёбер
 * 
 * 
 */


public class DijkstrasPQ {
	
public static void Search(ArrayList<Integer>[] graph, int vertexSearsh) {//Алгоритм Дейкстры с приорететной очередью
		
		int[] arrayMinLength = new int[graph.length];///массив с наименьшими длинами
		
		Arrays.fill(arrayMinLength, Integer.MAX_VALUE);//заполняем массив числами, большими чем любой путь графа(в теории это бесконечности)
				
		arrayMinLength[vertexSearsh] = 0;//путь от и до главного узла
		
		PriorityQueue<Integer> deque = new PriorityQueue<Integer>(new Comp(arrayMinLength));//очередь с приорететом по минимальному расстоянию
				
		deque.add(vertexSearsh);//добавляем искомый узел в очередь
				
		while(!deque.isEmpty()) {//пока очередь не пустая
			
            int vertex = deque.poll();//извлекаем узел
                                    
            for (int i = 1; i < graph[vertex].size(); i++) {//перебираем все смежные узлы графа
            	  
                if (arrayMinLength[vertex] + graph[vertex].get(i) < arrayMinLength[i]) {//если расстояние от узла u + расстояние до смежного его смежного узла 
                	
                	arrayMinLength[i] = arrayMinLength[vertex] + graph[vertex].get(i); //минимальное расстояние до узла i через узел vertex
                	
                	deque.add(i);
                }
            }	
		}	
		
        System.out.println("------------------------------------------------------------"); 
		
        System.out.println("Узел \t\t Минимальная дистанция"); 
        
        for (int i = 1; i < arrayMinLength.length; i++) {
        	
            System.out.println(i + " \t\t " + arrayMinLength[i]); 
            
        }
	
	}
	

	public static class Comp implements Comparator<Integer>{//КОМПОРАТОР
		
		private int[] arr;
		
		public Comp(int[] arr) {
			
			this.arr = arr;
		}

		@Override
		public int compare(Integer a, Integer b) {
			
			return arr[a] - arr[b];
		}
	}
}