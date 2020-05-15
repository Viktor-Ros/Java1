package Algorithm_Search_Dijkstras;

import java.util.ArrayDeque;
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
 * 
 */



public class Dijkstras {
	
	public static void Search(ArrayList<Integer>[] graph, int vertexSearsh) {
		
		System.out.println("--------------------------------------");
				
	int[] arrayMinLength = new int[graph.length];//массив с длинами
	
	Arrays.fill(arrayMinLength, 1000000);//заполняем массив числами, большими чем любой путь графа(в теории это бесконечности)
	
	arrayMinLength[vertexSearsh] = 0;//путь от и до главного узла
				
	boolean[] arrayBool = new boolean[graph.length];//массив для помечания узлов
						
	int count = 0;//переменная для посчета операций
			
	for(int i = 1; i < arrayMinLength.length; i++) {
					
        int vertex = 0; 
        
        int min = 1000000;
             
        for (int j = 1; j < arrayMinLength.length; j++) { 
        	
            if (arrayBool[j] == false && arrayMinLength[j] <= min) { 
            	
                min = arrayMinLength[j]; 
                
                vertex = j; 
            }  
            
        count++;
        
        }
		
        arrayBool[vertex] = true;
		
        for (int k = 1; k < graph.length; k++) { 
        	  
            if (arrayBool[k] == false && arrayMinLength[vertex] + graph[vertex].get(k) < arrayMinLength[k]) {
            	
            	arrayMinLength[k] = arrayMinLength[vertex] + graph[vertex].get(k); 
            }
        }	
	}
	
	
    System.out.println("Узел \t\t Минимальная дистанция"); 
    
    for (int i = 1; i < arrayMinLength.length; i++) {
    	
        System.out.println(i + " \t\t " + arrayMinLength[i]); 
        
    }

	System.out.println("Кол-во операций = " + count);
		
	}
}