package Exercises_Level6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/*
 * 
 * У каждой кошки есть имя, кот-папа и кошка-мама.
 * Создать 6 объектов: дедушку (папин папа), бабушку (мамина мама), папу, маму, сына, дочь.
 * Вывести их всех на экран в порядке: дедушка, бабушка, папа, мама, сын, дочь.
 * 
 */

public class task2 {

		    public static void main(String[] args) throws IOException {
		        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
	            
		        String grannyDead = reader.readLine();
		        Cat catDead = new Cat(grannyDead, null, null);
		        
		        String grannyBabka = reader.readLine();
		        Cat catBabka = new Cat(grannyBabka, null, null);
		        		        
		        String dadName = reader.readLine();
		        Cat catDad = new Cat(dadName, catDead, null);
		        
		        String motherName = reader.readLine();
		        Cat catMother = new Cat(motherName, null, catBabka);	
		        
		        String sonName = reader.readLine();
		        Cat catSon = new Cat(sonName, catDad, catMother);	
		        
		        String daughterName = reader.readLine();
		        Cat catDaughter = new Cat(daughterName, catDad, catMother);
		          
		        catDead.toString();
		        System.out.println(catBabka);
		        System.out.println(catDad);
		        System.out.println(catMother);		        
		        System.out.println(catSon);
		        System.out.println(catDaughter);
		    }

		    public static class Cat {
		        private String name;
		        private Cat dad;
		        private Cat mom;

		        Cat(String name, Cat dad, Cat mom) {
		            this.name = name;
		            this.dad = dad;
		            this.mom = mom;
		        }
		          
		        @Override
		        public String toString() {
		        	String momString = null; 
		        	String dadString = null; 
		            
		            if (mom == null) 
		            momString = ", no mother"; 
		            else momString = ", mother is " + mom.name; 
		            
		            if (dad == null) 
		            dadString = ", no father"; 
		            else dadString = ", father is " + dad.name; 
		           		                 
		            return "The cat's name is " + name + momString + dadString;
		        }
		    }
		}