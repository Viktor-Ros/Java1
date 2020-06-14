package WaitAndNotify;

public class ThreadWait extends Thread{
	 
	private String name;
	
	ThreadWait(String name){
		
		this.name = name;
	}
	
	@Override
	public void run() {
		 
		synchronized (StartWN.o) {
			
			System.out.println(name + " Начал работу ");
			
			try {
				StartWN.o.wait();//пристанавливаем выполнение потока, освобождая монитор объекта
			} catch (InterruptedException e) {

			}
			
			System.out.println(name + " Закончил работу ");
		}
	}
}