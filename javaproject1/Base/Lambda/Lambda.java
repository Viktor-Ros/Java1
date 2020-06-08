package Lambda;

/*
 * 
 * ЛЯМБДА
 * класс: Lamdba, 
 * интерфейс: InterfaceLamdba
 * Лямбда - емкий способ записи реализации метода
 * -> - лямбда оператор
 * аргументы(слева от оператора) -> операция с аргументами(справа от оператора)
 * 
 */


public class Lambda{


    public static void main(String[] args) {  

    	// Код реализации интерфейса
    	
    	InterfaceLambda in = new InterfaceLambda() {
    		@Override
			public int variable(int a, int b) {
				return a + b;
			}
    	};
    	System.out.println(in.variable(3,4) + " - Сумма без лямбды");
    	
    	// Конец реализации интерфейса(7 строк)
    	
    	
// Реализация интерфейса через лямбду
    	
InterfaceLambda s1;
s1 = (a,b) -> a + b;
System.out.println(s1.variable(5,4) + " - Сумма c лямбдой");

//Конец кода реализации интерфейса(3 строки)

InterfaceLambda s2;
s2 = (a,b) -> a * b;
System.out.println(s2.variable(5,4) + " - Произведение c лямбдой");

InterfaceLambda s3;
s3 = (a,b) -> a - b;
System.out.println(s3.variable(5,4) + " - Расзность c лямбдой");

    }   
}