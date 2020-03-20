package JavaCore_Level8_WrapperClass;

public class FordWrapper extends Ford {

	private Ford original;//объект класса Ford
	
		 public FordWrapper (Ford ford){ //конструктор FordWrapper
			 
		  this.original = ford;
		 }

		 public String getName(){
			 
		 return original.getName() + " Mustang";  //дополнение функционала Ford
	}
}