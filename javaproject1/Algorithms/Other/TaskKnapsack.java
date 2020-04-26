package Other;

import java.util.ArrayList;
import java.util.Arrays;

/*
 * 
 * ЗАДАЧА ПРО РЮКЗАК
 * 
 * Условие: есть рюкзак ограниченной грузоподъемности, и набор предметов, каждый со своим весом и ценой, найти набор предметов, которые дадут максимальную стоимость в пределах грузоподъемности рюкзака 
 * 
 * Решение: Создаем матрицу, в которой по горизонтали столбцы с массами, по вертикали кол-во предметов
 * в матрице будем хранить максимальные стоимость рюкзака, для текущих массы и кол-ва предметов
 * m - вместимость рюкзака
 * n - кол-во предметов
 * Mn - масса предмета
 * P(n,m) - максимальная стоимость первых n предметов при вместимость m
 * 
 * матрица заполняется путем выбора максимального из двух показателей:
 * - P(n-1,m) - максимальная стоимость без предмета(значение из верхней ячейки)
 * - P(n-1,m-Mn) + Pn - максимальная стоимость без предмета(значение из верхней строки на Mn ячеек влево) + стоимость предмета
 * 
 * то есть смотрим на набор без текущего предмета и на набор с текущим предметом и выбираем тот, который дороже
 * 
 * восстанавливаем ответ, добавляя в список предмет:
 * критерий добавления предмета такой: предмет не входил в предыдущий набор предметов при равной массе этих наборов
 * 
 */

public class TaskKnapsack {
	
	public static class Sol {//класс предметов
		int weight;
		int price;
		
		public Sol(int weight, int price){
			this.weight = weight;
			this.price = price;
		}
		
		public int getWeight() {
			return weight;
		}
		
		public int getPrice() {
			return price;
		}
		
		@Override
		public String toString() {
			return "W" + weight + "P" + price;
		}
	}
	

	public static void main(String[] args) {
		 
		Sol sol1 = new Sol(0,0);
		Sol sol2 = new Sol(2,4);
		Sol sol3 = new Sol(3,3);
		Sol sol4 = new Sol(4,2);
		Sol sol5 = new Sol(5,6);
		
		Sol[] arrSol = {sol1, sol2, sol3, sol4, sol5};//массив с предметами
		
		int s = 21;//вместимость рюкзака
		
	    System.out.println("Предметы: " + Arrays.toString(arrSol));
	    System.out.println("Вместимость рюкзака: " + s);

		int[][] arrPrice = new int[arrSol.length] [s+1];
		
		for(int n = 1; n < arrSol.length; n++) {//перебор предметов
			
			for(int m = 0; m < s + 1; m++) {//перебор масс

				if(m >= arrSol[n].weight) {
					
					arrPrice[n][m] = Math.max(arrPrice[n-1][m], arrPrice[n-1][m-arrSol[n].weight] + arrSol[n].price);//заполнение матрицы

				}
				
				else arrPrice[n][m] = arrPrice[n-1][m];
			}
		}

		//////////////////////////////////////////////////////		ВЫВОД МАТРИЦЫ НА ЭКРАН
	    /*for (int i = 0; i < arrSol.length; i++) {
	        for (int j = 0; j < s + 1; j++) {
	          System.out.print(arrPrice[i][j] + " ");
	   
	        }
	        System.out.println();
	      }*/
	    /////////////////////////////////////////////////////
	    
	    System.out.println("Максимальная стоимость: " + arrPrice[arrSol.length - 1][s]);
	    
	    ArrayList<Sol> list = new ArrayList<>();
	    
	    int mass = 0;
	    
	    for(int n = arrSol.length - 1; n > 0; n--) {//восстановление ответа

	    	if(arrPrice[n][s] != arrPrice[n-1][s]) {
	    		
	    		list.add(arrSol[n]);
	    		s -= arrSol[n].weight;
	    		mass += arrSol[n].weight;
	    	}
	    }
	    
	    System.out.println("Масса набора: " + mass);
	    System.out.println("Нужные предметы: " + list);
	}
}