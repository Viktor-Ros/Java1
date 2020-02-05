package Initialize;

public class AnimalFerm {

	String animal;
    int age;
    int weight;

    public void initialize(String animal){//Инициализатор
    	
        this.animal = animal;
    }
    
    public void initialize(int age, int weight){//Переписанный инициализатор
    	
    	this.age = age;
        this.weight = weight;
    }
}