package Arrays;

public class Methodoverriding1 extends Methodoveriding {

	
		
		public void a() {
			super.a();
			System.out.println("this is child");
		}

		public static void main(String[] args) {
			Methodoverriding1 obj = new Methodoverriding1();
			 obj.a();
		}
	}


