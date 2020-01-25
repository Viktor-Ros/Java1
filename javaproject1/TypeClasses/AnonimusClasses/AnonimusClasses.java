package AnonimusClasses;

/*
 * 
 * АНОНИМНЫЕ КЛАССЫ
 * классы: AnonimusClasses, Dog, Cat, Pig, AnimalVoices
 * Вместо создания трех отдельных классов: Dog, Cat, Pig, мы создаем один класс AnimalVoices 
   и создаем три безымянных класса в классе AnonimusClasses, в которых метод animalVoice переопределятся под наши задачи
 * Анонимный класс - класс, который создается в момент инициализации объекта, используется для сокращения кода
 * Анонимные классы не имеют имени
 * Анонимные классы являются наследниками класса, методы которого используем, и к ним применим полиморфизм
 * Анонимные классы нужны, если:
 * - тело класса очень кророткое
 * - нужен только один экземпляр класса
 * - класс используется в месте его создания или сразу после него
 * - имя класса неважно
 * 
 */


public class AnonimusClasses {

	public static void main(String[] args) {
		
		Dog dog = new Dog();//Дергаем экземпляр класса Dog и его метод dogVoice
		dog.dogVoice();
		
		Cat cat = new Cat();
		cat.catVoice();
		
		Pig pig = new Pig();
		pig.pigVoice();
		
		
		AnimalVoices dogAnon = new AnimalVoices() {//Анонимный(безымянный) класс, который наследуется от класса Dog
		//Одновременно добавляем класс{} и создаем его объект();
			
			@Override  //Переопределение метода animalVoice из класса AnimalVoices
			public void animalVoice() {
				System.out.println("гав-гав-гав");
			}	
		};
		
		AnimalVoices catAnon = new AnimalVoices() {
			@Override
			public void animalVoice() {
				System.out.println("мяу-мяу-мяу");
			}	
		};
		
		AnimalVoices pigAnon = new AnimalVoices() {
			@Override
			public void animalVoice() {
				System.out.println("хрю-хрю-хрю");
			}	
		};
		
		dogAnon.animalVoice();
		catAnon.animalVoice();
		pigAnon.animalVoice();
		
		AnimalVoices animal = new AnimalVoices() {//Анонимный класс без переопределения метода
		};
		animal.animalVoice();
		
	}
}