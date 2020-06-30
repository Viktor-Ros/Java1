package BaseThread;


/*
 * 
 * МНОГОПТОЧНОСТЬ
 * 
 * классы: StartBaseThread, BaseThread1, BaseThread2
 * 
 * Многопоточность нужна для:
 * - Одновременное выполнение нескольких действий
 * - Ускорение вычислений(если процессор многоядерный)
 * 
 * Мы не можем контролировать последовательность(порядок) выполнения потоков
 * 
 * метод start() - запускает поток
 * 
 * метод sleep() - приостнавливает выполнение программы
 * 
 * метод interrupt() - останавливает поток, выбрасывая исключение InterruptedException, которое мы ловим в классе потока и останавливаем поток в блоке catch
 * 
 * метод join() - запускает ожидание завершения потока
 * 
 * volatile - модификатор переменной, который говорит что значение этой переменной для чтения/записи нужно брать из общей памяти(одного места)
 * volatile - используется потому что потоки не отслеживают работу(изменение переменных) других потоков
 * 
 */

public class StartBaseThread {
	
	public static void main(String[] args) throws InterruptedException {
						
		BaseThread1 baseThread1 = new BaseThread1("baseThread1");//создание объекта, который содержит метод run()
		
	    BaseThread2 baseThread2 = new BaseThread2("baseThread2");
		
		Thread bThread1 = new Thread(baseThread1);//создание Thread и передача ему в конструктор объекта, чей run() нужно реализовать
				
		bThread1.start();
		
		System.out.println("Статус потока " + bThread1.getName() + ": " + bThread1.isAlive()); //имя и статус потока
		
		bThread1.join();
		
		baseThread2.start();

		baseThread2.sleep(2000);

		baseThread2.interrupt();
	}
}