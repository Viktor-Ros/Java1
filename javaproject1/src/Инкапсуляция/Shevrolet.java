package »нкапсул€ци€;

/*
*»Ќ јѕ—”Ћя÷»я
*классы: class22, car
*дл€ работы с переменными из другого класса, измен€ть сами переменные нельз€
*в классе car есть приватные переменные color и price, которые нужны другим классам, но в этих измен€ть их нельз€(банковские данные пользователей)
*/

public class Shevrolet {

public static void main (String[] args){

Car car = new Car();

System.out.println("÷вет: " + car.getColor());
System.out.println("÷ена: " + car.getPrice());
}
}