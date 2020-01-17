package Коллекции;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
/*
 * 
 * ИТЕРАТОР
 * Итератор - метод, который перебирает элементы в коллекции
 * Может вывести элементы и/или индексы листа с начала до конца и наоборот
 * Может заменять элементы по индексу
 * 
 */

public class Iterators {

public static void main(String[] args) {
        
        List Ferm = new ArrayList();
        Ferm.add("Cow");
        Ferm.add("Pig");
        Ferm.add("Horse");
        Ferm.add("Dog");
        Ferm.add("Cat");
        
        System.out.println("Лист: " + Ferm);
        
        ListIterator itr = Ferm.listIterator();// - Итератор
                
        System.out.println("Перебор листа от начала до конца:"); 
        while(itr.hasNext())
        {
        	System.out.println("Индекс - " + itr.nextIndex() + " " + "Элемент - " + itr.next());//Возвращает след. элемент и его индекс  
        }
               
        System.out.println("Перебор листа с конца в начало:");
        while(itr.hasPrevious())
        {
        	System.out.println("Индекс - " + itr.previousIndex() + " " + "Элемент - " + itr.previous());//Возвращает пред. элемент и его индекс          
        }
         
        System.out.println("Замена элемента Cow с индексом 0 на Sheep");
        while(itr.hasNext())//Замена элемента по индексу
        {
        	Ferm.set(0, "Sheep");
        	System.out.println("Индекс - " + itr.nextIndex() + " " + "Элемент - " + itr.next());//Возвращает пред. элемент и его индекс
            
        }

        }       
}