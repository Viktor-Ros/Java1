package Synchronized;


public class SynchThread1 extends Thread{
	
	private String name;
	
	SynchThread1(String name){
		
		this.name = name;
	}

	@Override
	public void run() {
			       
		try {
				
			StartSynchronized.printThread(name);	
		} 
		
		catch (InterruptedException e) {
		}			
	}
}