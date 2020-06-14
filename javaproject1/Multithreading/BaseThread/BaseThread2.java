package BaseThread;

/*
 * 
 * Создание потока через наследование от класса Thread
 * 
 * 
 */

public class BaseThread2 extends Thread{
	
	private String name;
	
	BaseThread2(String name){
		
		this.name = name;
	}
	
	@Override
	public void run(){
		
		while(true) {
			
			try {
				
				System.out.println(name);
				Thread.sleep(200);//приостанавливает выполение кода на 200 милисекунд
				} 
			
			catch (InterruptedException e) {//останавливает поток по каманде - .interrupt()
				break;
				}
		}
	}
}