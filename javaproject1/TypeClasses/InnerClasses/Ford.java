package InnerClasses;

/*
 * 
 * ВНУТРЕННИЕ КЛАССЫ
 * классы: Ford, Car
 * Внутренний класс - класс, находящийся внутри другого класса
 * Внутренние классы используются только тогда, когда они нужны для работы одного другого класса
 * В отличии от конструкторов методы внутренних классов могут возвращать значения(т.е. конструктор просто говорит что испозльзовать
 * Внутренние классы нужны для постороения понятной логики программы и сокращения кода
 * Внутренний класс имеет полный доступ к переменным внешнего класса, даже к private
 * Члены внутреннего класса могут быть объявлены только для внешнего, чтобы избежать их влияния на всю программу 
 *  
 */

public class Ford {

    static String Model = "Mustang";
    static String Color = "Red";
    static String Type = "Coupe";
    static int Weight = 2000;
    static int maxSpeed = 300;
    static int Price = 10000;
	
	
public static void main(String[] args) {
	
	//Экземпляры вложенных нестатических классов
	
	Car Ford = new Car();//Создаем экземпляр Ford класса Car
	Car.Model model = Ford.new Model();//Привязка внутреннего класса Model к внешнему классу Car
	//Создаем экземпляр model внутреннего класса Model класса Car для объекта Ford
	Car.Color color = Ford.new Color();
	Car.Weight weight = Ford.new Weight();
	model.mod(Model);
	color.col(Color);
	weight.wei(Weight);
	
	Ford.Type(Type);//Метод Type напрямую из класса Car
	
	//Экземпляры вложенных стических классов
	Car.maxSpeed mxs = new Car.maxSpeed();//Экземпляр mxs статического класса maxSpeed
	mxs.ms(maxSpeed);
	Car.Price pri = new Car.Price();
	pri.pr(Price);

	}
}