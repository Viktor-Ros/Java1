package Exercises_Level5;

/*
 * 
 * ЗАДАЧА ПРО КОШАЧЬЮ ДРАКУ
 * классы: CatsFight, Cat
 * Условие: реализовать механизм драки котов в зависимости от их веса, возраста и силы.
 * 
 * в таких случаях нужно использовать КОМПРАТАТОР
 * int age = Integer.compare(this.age, anotherCat.age); Результатом будет: -1 или 0 или 1
 * 
 */

public class Cat {

    public int age;
    public int weight;
    public int strength;

    public Cat() {
    }

    public boolean fight(Cat anotherCat) {    	
    	int a = 0;
    	
    	if(anotherCat.age > this.age) {
    		
    	a++;	
    	}
    	
    	if(anotherCat.age < this.age) {
    		
    	a--;	
    	}
    	
    	if(anotherCat.weight > this.weight) {
    		
    	a++; 	
    	}
    	
    	if(anotherCat.weight < this.weight) {
    		
    	a--;
    	}
    	
    	if(anotherCat.strength > this.strength) {
    		
    	a++;
    	}
    	
    	if(anotherCat.strength < this.strength) {
    		
    	a--;
    	}
    	
    	if(a == 0) {
    	return false; //ничья
    	}
    	
    	else {return a > 0;}
    	
    }
}
