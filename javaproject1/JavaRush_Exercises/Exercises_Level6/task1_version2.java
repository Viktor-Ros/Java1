package Exercises_Level6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class task1_version2 {
	
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
     
        String grannyDead = reader.readLine();
        Cat catDead = new Cat(grannyDead, null, null);
        
        String grannyBabka = reader.readLine();
        Cat catBabka = new Cat(grannyBabka, null, null);
        
        for(int i = 0; i < 2; i++) {
        		String catNameDad = new Scanner(System.in).nextLine();
        		String catNameMom = new Scanner(System.in).nextLine();
        		String catNameSon = new Scanner(System.in).nextLine();
        		String catNameDaughter = new Scanner(System.in).nextLine();
        	
            	Cat catDad = new Cat(catNameDad, catDead, null);
            	Cat catMom = new Cat(catNameMom, null, catBabka);  
     
            	Cat catSon = new Cat(catNameSon, catDad, catMom);
            	Cat catDaughter = new Cat(catNameDaughter, catDad, catMom);
            	
                System.out.println(catDead);
                System.out.println(catBabka);
                System.out.println(catDad);
                System.out.println(catMom);		        
                System.out.println(catSon);
                System.out.println(catDaughter);
        	}
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