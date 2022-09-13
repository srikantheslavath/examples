package Arrays;

public class Methodoverloading {
	
	public void m(int a) {
		System.out.println("hello");
	}
public void m(int a, int b) {
	System.out.println("hola");
}

	
public void m(int a, int b , int c) {
	System.out.println("Hi");
}


public static void main(String[] args) {
	Methodoverloading obj = new Methodoverloading();
	
	obj.m(8);
	obj.m(22, 33);
	obj.m(44, 55, 66);
}

}



