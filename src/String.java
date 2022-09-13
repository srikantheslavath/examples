
public class String {

	public String(java.lang.String string) {
		// TODO Auto-generated constructor stub
	}

	public static void main(java.lang.String[] args) {
		// TODO Auto-generated method stub

		java.lang.String a= "hello";
		java.lang.String b = "hello";
		
		String c = new String("hello");
		String d = new String ("hello");
		
		
		if(d==c)
				{
			System.out.println("equal");
			
		}
		else
		{
			System.out.println("not");
		}
	}

}
