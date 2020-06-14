package BaseThread;

/*
 * 
 * Создание потока через интерфейс Runnable
 * 
 * 
 */


public class BaseThread1 implements Runnable{
	
	private String name;
	
	BaseThread1(String name){
		
		this.name = name;
	}
	
	@Override
	public void run() {//код, который выполнится при запуске потока
		
		for(int i = 0; i < 10; i++) {
			
			try {
				
				Thread.sleep(200);//приостанавливает выполение кода на 200 милисекунд
				
			} catch (InterruptedException e) {//перехват InterruptedException

			}
			System.out.println(name);
			
		}			
	}
}