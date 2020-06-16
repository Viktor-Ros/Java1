package WaitAndNotify;

/*
 * 
 * МНОГОПОТОЧНОСТЬ WAIT/NOTIFY
 * 
 * классы: StartWN, ThreadNotify, ThreadWait
 * 
 * Мьютекс - указатель на то, выполняет ли какой-то поток код или нет
 * Монитор - механизм, который не пускает другие потоки в код, если мьютекс закрыт
 * 
 * метод wait() - вызывается в потоке и приостанавливает его выполнение, пока другим потоком не будет вызван метод notify()/notifyAll()
 * метод notify() - вызывается в потоке и запускает один поток, у которого был ранее вызван wait()
 * метод notifyAll() - запускает все потоки у которыйх был вызван wait()
 * 
 */


public class StartWN {
	
	static Object o = new Object();//объект, по которому будут синхронизироваться потоки
	 
    public static void main(String[] args) throws InterruptedException {
        
        ThreadNotify threadNot = new ThreadNotify("threadNotify");
        
        ThreadWait threadWait1 = new ThreadWait("threadWait1");
        ThreadWait threadWait2 = new ThreadWait("threadWait2");
        
        threadWait1.start();
        threadWait2.start();
        
        Thread.sleep(2000);
        
        threadNot.start();   
    }
}