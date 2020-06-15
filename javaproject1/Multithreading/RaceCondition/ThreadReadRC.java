package RaceCondition;

/*
 * 
 * Поток, который считывает только четные значения переменной race
 * 
 */

public class ThreadReadRC extends Thread{
	
	private String name;
	
	ThreadReadRC(String name){
		
		this.name = name;
	}
	
	@Override
	public void run(){
		
		while(true) {
			
			synchronized(StartRC.syncObj) {//синхронизация по syncObj
					
				if (StartRC.race % 2 == 0) {
					System.out.println(name + " четное значение race =  " + StartRC.race);
				}
			}
			
			try {
				Thread.sleep(200);
			}

			catch (InterruptedException e) {
				break;
			}	
		}
	}
}