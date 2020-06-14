package Synchronized;


/*
 * 
 * ПОТОКИ/МНОГОПОТОЧНОСТЬ SYNCHRONIZED
 * 
 * классы: StartSynchronized, synchThread1, synchThread2
 * 
 * synchronized() - блок кода/модификатор метода, который блокирует этот код/метод, если его использует другой поток 
 * synchronized() - работает с переменными, методами и объектами
 * 
 * если метод статический, то в synchronized() вписываем класс: synchronized(ClassName.class)
 * 
 */


public class StartSynchronized {

	public static void main(String[] args) {

		SynchThread1 synchThread1 = new SynchThread1("synchThread1");
		SynchThread2 synchThread2 = new SynchThread2("synchThread2");
		
		synchThread1.start();	
		synchThread2.start();
	}
	
	public synchronized static void printThread(String a) throws InterruptedException {//Синхронизированный метод
			
		for(int i = 0; i < 11; i++) {
				
			Thread.sleep(100);
				
			System.out.println(a);
		}
	}
}