package DeadLock;

/*
 * 
 * Поток не может синхронизироваться по ob2, тк его монитор занят другим потоком t2
 * 
 */

public class ThreadDL1 extends Thread{
	
	private String name;
	
	ThreadDL1(String name){
		
		this.name = name;
	}
	
	@Override
    public void run() {
        synchronized (StartDL.syncObj1) {//синхронизация по ob1
           System.out.println(name + " синхронизировался по syncObj1");

           try { Thread.sleep(100); }
           catch (InterruptedException e){}
           
           System.out.println(name + " ожидает синхронизации по syncObj2");

           synchronized (StartDL.syncObj2) {//синхронизация по ob2
              System.out.println(name + " синхронизировался по syncObj2");
           }
        }
	}
}	