package WaitAndNotify;

public class ThreadNotify extends Thread{
    
	private String name;
	
	ThreadNotify(String name){
		
		this.name = name;
	}
	
	@Override
	public void run() {	
		
		synchronized (StartWN.o) {
			
			System.out.println(name + " Начал работу ");
			
			//StartWN.o.notify();//запускаем случайный поток, в состянии wait()
			StartWN.o.notifyAll();//запускаем все потоки, в состянии wait()
			
			System.out.println(name + " Закончил работу ");
		}
	}
}