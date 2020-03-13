package JavaCore_Level7_Thread;

/*
 * 
 * ПОТОКИ/МНОГОПОТОЧНОСТЬ 
 * 
 * классы: Gagarin, StartThread, Marines
 * 
 * synchronized() - блок кода/модификатор метода, который блокирует этот код/метод, если его использует другой поток 
 * synchronized() - работает с переменными и объектами
 * если метод статический, то в synchronized() вписываем класс: synchronized(ClassName.class)
 * 
 * Thread.yield() - метод(есть в классе Gagarin), который говорит, что поток готов отказаться от текущего использования процессора
 * к выполнению потока с Thread.yield() процессор возвращается после выполнения следующего потока
 * Thread.yield() выполняется по усмотрению планировщика
 * 
 * volatile - модификатор переменной, который говорит что значение этой переменной для чтения/записи нужно брать из общей памяти(одного места)
 * volatile - используется потому что потоки не отслеживают работу других потоков
 * 
 */

public class StartThread {

	public static void main(String[] args) {

		Gagarin Ura = new Gagarin();
		Marines Natalya = new Marines();
		
		Thread threadUra = new Thread(Ura);
		Thread threadNatalya = new Thread(Natalya);
		
		threadUra.start();	
		threadNatalya.start();		


	}
	
	public static void printThread(String a) throws InterruptedException {
		
		synchronized(StartThread.class) {
	
			for(int i = 0; i < 11; i++) {
				Thread.sleep(100);
				System.out.println(a);
			}
			
		}
	}
	

}