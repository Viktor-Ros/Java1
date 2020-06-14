package Synchronized;


/*
 * 
 * Thread.yield() - метод, который говорит планировщику, что поток готов приостановить использование процессора
 * К выполнению потока с Thread.yield() процессор возвращается после выполнения следующего потока
 * Thread.yield() выполняется по усмотрению планировщика
 * 
 */


public class SynchThread2 extends Thread{
	
	private String name;
	
	SynchThread2(String name){
		
		this.name = name;
	}
	
	@Override
	public void run() {
		
		Thread.yield();
	       
		try {
				
			StartSynchronized.printThread(name);	
		} 
		
		catch (InterruptedException e) {
		}			
	}
}