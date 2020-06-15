package DeadLock;

/*
 * 
 * МНОГОПТОЧНОСТЬ ВЗАИМНАЯ БЛОКИРОВКА
 * 
 * Взаимная блокировка(deadlock) - ситуация, когда несколько потоков находятся в ожидании ресурсов, занятых друг другом
 * 
 * Взаимная блокировка - результат ошибки в проектировании программы 
 * 
 * отличия interrupt от interrupted
 * daemon problem
 * 
 */


public class StartDL {
		
	public static Object syncObj1 = new Object();
	public static Object syncObj2 = new Object();
	
	public static void main(String[] args) throws InterruptedException {
		
		ThreadDL1 tDL1 = new ThreadDL1("tDL1");
		ThreadDL2 tDL2 = new ThreadDL2("tDL2");

		tDL1.start();
		tDL2.start();
	}
}