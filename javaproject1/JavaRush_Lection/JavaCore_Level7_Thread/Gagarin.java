package JavaCore_Level7_Thread;

class Gagarin implements Runnable{

	public void run() {
		
	       Thread.yield();
			try {
				StartThread.printThread("Поехали!");
			} catch (InterruptedException e) {

			}			
	
	}
}