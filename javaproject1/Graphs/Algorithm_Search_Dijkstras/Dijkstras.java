package Algorithm_Search_Dijkstras;

import java.util.ArrayList;
import java.util.Arrays;


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
 * поиск выполняется за O(n2+m), где n — кол-во вершин, m — кол-во рёбер
 * 
 * 
 */


public class Dijkstras {
	
	public static void Search(ArrayList<Integer>[] graph, int vertexSearch) {
		
		int[] arrayMinLength = new int[graph.length];//массив с наименьшими длинами
		
		Arrays.fill(arrayMinLength, Integer.MAX_VALUE);//заполняем массив числами, большими чем любой путь графа(в теории это бесконечности)
		
		arrayMinLength[vertexSearch] = 0;//путь от и до главного узла
					
		boolean[] arrayBool = new boolean[graph.length];//массив узла, если известно минимальное расстояние до узла -  он true
											
		for(int i = 1; i < arrayMinLength.length; i++) {//перебираем массив с наименьшими длинами
						
            int vertexMin = 0;//узел с минимальным расстоянием
            
            int min = Integer.MAX_VALUE;//минимальное расстояние до узла 
                 
            for (int j = 1; j < arrayMinLength.length; j++) { //перебор для определения узла с минимальным расстоянием
            	
                if (arrayBool[j] == false && arrayMinLength[j] <= min) {
                	
                    min = arrayMinLength[j];
                    
                    vertexMin = j; 
                }  
            }
			
            arrayBool[vertexMin] = true;
			
            for (int k = 1; k < graph.length; k++) {//перебор для определения минимального расстояния до узлов
            	  
                if (arrayBool[k] == false 
                		
                		&& arrayMinLength[vertexMin] + graph[vertexMin].get(k) < arrayMinLength[k]) {
                	
                	arrayMinLength[k] = arrayMinLength[vertexMin] + graph[vertexMin].get(k);//минимальное расстояние до узла k через узел minVertex
                }
            }	
		}
		
        System.out.println("------------------------------------------------------------"); 
		
        System.out.println("Узел \t\t Минимальная дистанция"); 
        
        for (int i = 1; i < arrayMinLength.length; i++) {
        	
            System.out.println(i + " \t\t " + arrayMinLength[i]); 
            
        }	
	}
}