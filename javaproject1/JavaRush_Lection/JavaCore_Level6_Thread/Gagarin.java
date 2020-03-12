package JavaCore_Level6_Thread;

public class Gagarin implements Runnable{//Класс должен реализовывать интерфейс Runnable, чтобы его объект можно было запускать в потоке
	
	public void run() {
		
		for(int i = 0; i < 10; i++) {
			
			try {
				
				Thread.sleep(100);
				
			} catch (InterruptedException e) {

			}
			System.out.println("Поехали!");
			
		}	
	}
}