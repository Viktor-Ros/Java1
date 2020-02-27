package Exercises_Level8;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*
 * 
 * 1. Создай список чисел.
 * 2. Добавь в список 10 чисел с клавиатуры.
 * 3. Вывести на экран длину самой длинной последовательности повторяющихся чисел в списке.
 * 
 * 
 * Оказывается int больше 127 нужно сравнивать через equals()
 */

public class task1 {

    public static void main(String[] args) {

    	List<Integer> list = new ArrayList<Integer>();
    	List<Integer> list1 = new ArrayList<Integer>();
    	
    	for(int i = 0; i < 10; i++) {
    		int x = new Scanner(System.in).nextInt();
    		list.add(x);
    	}
    	
    	int a = 1;    	
    	int b = 1;
    	
    	for(int i = 0; i < list.size()-1; i++) {

    		if(list.get(i).equals(list.get(i+1))) {
    			a++;
    			if(b < a) {
        			b = a;	
    			}
    		}
    		if(!list.get(i).equals(list.get(i+1))) {
    			list1.add(a);
    			a = 1;
    		}
    		
    		if(i == list.size()-2) {
    			list1.add(a);
    		}	
    	}
    	System.out.println(b);    	
    }
}
