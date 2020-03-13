package JavaCore_Level6_Thread;

class Marines implements Runnable{
	
	public void run(){
		
		Thread current = Thread.currentThread();//Получение объекта вызвавшей его нити(текущей нити)
		
		while(!current.isInterrupted()) {
			
			try {
				
				System.out.println("Стартуем!");
				Thread.sleep(100);
				
				} 
			
			catch (InterruptedException e) {
				break;
				}
		}
	}
}