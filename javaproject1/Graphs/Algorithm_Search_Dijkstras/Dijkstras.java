package Algorithm_Search_Dijkstras;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Stack;


/*
 * 
 * АЛГОРИТМ ДЕЙКСТРЫ
 * 
 * Алгоритм поиска кратчайших путей в взвешеном, ориентированном графе c положительными ребрами
 * 
 * классы: DIJKSTRAS, Graphs
 * 
 * Выбираем узел от которого нужно найти кратчайшие расстояния
 * Запоминаем пути от узла до смежных узлов, а путь до остальных узлов принимаем за бесконечность
 * Выбираем любой смежный узел
 * Считаем путь от главной узла до остальных узлов, но уже через выбранный узел
 * Запоминаем путь, если он короче текущего варианта, даже если короче пути до смежного узла
 * После опять выбираем узел и ищем короткие пути
 * Повторяем пока не найдем все короткие пути
 * 
 */



public class Dijkstras {
	
	public static void Search(ArrayList<Integer>[] graph, int vertexSearsh) {
		
		System.out.println("--------------------------------------");
				
		int[] arrayMinLength = new int[graph.length];//массив с наименьшими путями
		
		Arrays.fill(arrayMinLength, 1000);//заполняем массив числами, большими чем любой путь графа(в теории это бесконечности)
		
		arrayMinLength[vertexSearsh] = 0;//путь от и до главного узла
		
		System.out.println(Arrays.toString(arrayMinLength));
		
		Stack<Integer> stack = new Stack<>();//очередь из узлов
		
		stack.push(vertexSearsh);//добавляем в стек главный узел
		
		while(!stack.empty()) {//пока стек не пустой
			
			int vertex = stack.pop();//убираем из стека верхний узел
			
			for(int i = 0; i < graph[vertex].size(); i++) {//перебираем узлы, смежные с верхним узлом стека
				
				if(arrayMinLength[vertex] + graph[vertex].get(i) < arrayMinLength[i]) {//если путь между узлами меньше текущего
					
					arrayMinLength[i] = arrayMinLength[vertex] + graph[vertex].get(i);//устанавливаем новый путь
					
					stack.push(i);//добавляем смежный узел в стек
				}
				
			}
			
			System.out.println(Arrays.toString(arrayMinLength));
		}
		
	}
}