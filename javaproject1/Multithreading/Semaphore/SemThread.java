package Semaphore;

import java.util.concurrent.Semaphore;

public class SemThread extends Thread{
	
	private String name;
	private Semaphore sem;

	SemThread(String name, Semaphore sem){
		
		this.name = name;
		this.sem = sem;
	}
	
	@Override
    public void run() {

		System.out.println(name + " Ожидает разрешение");
			
		try {
			sem.acquire();
			System.out.println(name + " Начинает работу");
				
	        for (int i = 0; i < 5; i++){
	            		            	
	            System.out.println(name + "  " + i);
	            Thread.sleep(100);
	        }
		} 
			 
		catch (InterruptedException e) {}
			
			System.out.println(name + " Освобождает разрешение");
			
		sem.release();
	}
}	