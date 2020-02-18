package Exercises_Level8;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

public class task1 {

    public static void main(String[] args) {

    	List<Integer> list = new ArrayList<Integer>();
    	List<Integer> list1 = new ArrayList<Integer>();
    	
    	for(int i = 0; i < 10; i++) {
    		int x = new Scanner(System.in).nextInt();
    		list.add(x);
    	}
    	
    	int a = 1;
    	
    	for(int i = 0; i < list.size()-1; i++) {

    		if(list.get(i).equals(list.get(i+1))) {
    			a++;
    		}
    		if(!list.get(i).equals(list.get(i+1))) {
    			list1.add(a);
    			a = 1;
    		}
    		
    		if(i == list.size()-2) {
    			list1.add(a);
    		}
    		
    	}
    	
    	int max = list1.get(0);
    	for(int i = 0; i < list1.size(); i++) {
    			if(max < list1.get(i)) {
    				max = list1.get(i);
    			}
    	}
    	
    	System.out.println(max);
    	
    }
}
