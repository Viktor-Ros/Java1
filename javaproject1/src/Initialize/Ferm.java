package Initialize;

/*
 * 
 * ИНИЦИЛИЗАЦИЯ
 * классы: Ferm, AnimalFerm
 * инициализатор - присваивает(инициализирует) новое значение поля после его вызова
 * инициализатор - обычный невозвращаемый метод,
 * инициализатор можно перезаписывать как конструктор
 * в отличии от сеттера в инициализаторе можно использовать несколько параметров(в сеттере по общей договоренности используют один)
 * в отличии от конструктора не нужно каждый раз создавать новый объект инициализатора, можно просто копировать один
 * 
 */

public class Ferm {

        public static void main(String[] args) {
      	   	
        	String animal = "Сow";
            int age = 1;
            int weight = 100;

        	AnimalFerm AnimalFerm = new AnimalFerm();
  
            System.out.println("Животное до инициализации: " + AnimalFerm.animal);
            
            AnimalFerm.initialize(animal);//Вызов инициализатора
            
            System.out.println("Животное после инициализации: " + AnimalFerm.animal);
     
            animal = "Pig";

            AnimalFerm.initialize(animal);//Повторный вызов инициализатора с новым параметром
            
            System.out.println("Повторная инициализации: " + AnimalFerm.animal);
            
            
            AnimalFerm.initialize(age, weight);//Вызов переписанного инициализатор
            
            System.out.println("Возраст животного после инициализации: " + AnimalFerm.age);
            System.out.println("Вес животного после инициализации: " + AnimalFerm.weight);
            
      }
}