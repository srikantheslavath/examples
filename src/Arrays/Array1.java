package Arrays;

public class Array1 {

	public static void main(String[] args) {
		
	int a[] = {11,22,33,44,55,66};
	 char b[] = {'a','s','d','f','g'};
	 
	 int c[] = new int[5];
	 
	 c[0]= 101;
	 c[1]= 102;
	 c[3]= 103;
	  for (int k =0; k<c.length;k++) {
		  
		  System.out.println(c[k]);
		  
	  }
	 
	 for(int i=0; i<a.length;i++)
	 {
		 System.out.print(a[i]);
	 }
	 
	 for(char j : b) {
		 System.out.print(j);
	 }
		 
	 
	}

}
