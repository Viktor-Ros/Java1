package JavaCore_Level6_Thread;

/*
 * 
 * ПОТОКИ/МНОГОПОТОЧНОСТЬ 
 * 
 * классы: Gagarin, StartThread, Marines
 * 
 * Многопоточность нужна для:
 * - Одновременное выполнение нескольких действий
 * - Ускорение вычислений(если процессор многоядерный)
 * 
 * Мы не можем контролировать последовательность(порядок) выполнения потоков
 * 
 * Gagarin - класс с методом run, поток будет выполнять код внутри run
 * threadUra - поток с объектом класса Gagarin в качестве параметра
 * 
 * гонка
 * взаимная блокировка
 * 
 * отличия interrapt от interrapted
 * 
 */



public class StartThread {

	public static void main(String[] args) throws InterruptedException {
		
		Gagarin Ura = new Gagarin();
		Marines Natalya = new Marines();
		
		Thread threadUra = new Thread(Ura);
		Thread threadNatalya = new Thread(Natalya);
		
		threadUra.start();//запуск потока threadUra
		System.out.println("Статус потока " + threadUra.getName() + ": " + threadUra.isAlive());//

		threadUra.sleep(2000);//приостанавливает поток threadUra на 2000милисекунд(2 секунды)
		
		threadUra.interrupt();//остановка потока threadNatalya
		
		threadUra.join();//ожидание завершения потока threadUra
		
		System.out.println("Поток threadUra кончился!");
		System.out.println("Стартует поток threadNatalya!");
		
		threadNatalya.start();
		
		Thread.sleep(1000);//приостанавливает текущий(любой текущий) поток на секунду
		threadNatalya.interrupt();//останавливает поток threadNatalya, 
		                          //выбрасывая исключение InterruptedException, которое мы ловим в классе Marines
								  // и останавливаем поток в блоке catch

	}
}
