package DeadLock;

/*
 * 
 * Поток не может синхронизироваться по ob1, тк его монитор занят другим потоком t1
 *  
 */

public class ThreadDL2 extends Thread{
	
	private String name;
	
	ThreadDL2(String name){
		
		this.name = name;
	}
	
	@Override
    public void run() {
        synchronized (StartDL.syncObj2) {//синхронизация по ob2
           System.out.println(name + " синхронизировался по syncObj2");

           try { Thread.sleep(100); }
           catch (InterruptedException e){}
           
           System.out.println(name + " ожидает синхронизации по syncObj1");

           synchronized (StartDL.syncObj1) {//синхронизация по ob1
              System.out.println(name + " синхронизировался по syncObj1");
           }
        }
     
	}
}