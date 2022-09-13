package Arrays;

public class Car {

	String color;
	 int milege;
	 String model;
	 
	 public void m() {
		 System.out.println("car details");
	 }
	 
	 public static void main(String[] args) {
		Car info = new Car();
		
		info.color="black";
		info.milege= 7;
		info.model= "M8";
		
		info.m();
		System.out.println(info.color);
		System.out.println(info.milege);
		System.out.println(info.model);
		
	}
}
