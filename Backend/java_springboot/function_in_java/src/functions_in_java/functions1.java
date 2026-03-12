package functions_in_java;

public class functions1 {
	public static void main(String[] args) {
		/*
		 * 
		 * 
		 */
		
		functions1 fun = new functions1();
		fun.add(10,20);
		
	}
	//non static method : to access we should create a object of the class
	public void add(int a, int b) {
		System.out.println("res: "+(a+b));
	}
}
