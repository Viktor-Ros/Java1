package RaceCondition;

/*
 * 
 * Поток, который переписывает переменную race
 * 
 */

public class ThreadWriteRC extends Thread{
	
	private String name;
	
	ThreadWriteRC(String name){
		
		this.name = name;
	}
	
	@Override
	public void run(){
		
		while(true) {
			
			synchronized(StartRC.syncObj) {//синхронизация по syncObj
				
				StartRC.race++;
				System.out.println(name + " race = " + StartRC.race);
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