
public class SwapWithOutUsingThirdVariable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s1 = "JAVA";
		String s2 = "J2EE";
		
		swap(s1,s2);
	

	}
	
	
	static void swap(String a , String b)
	{
	
		
		int x = a.length();
		
		int y = b.length();
 
		a = a+b;
		
		b = a.substring(0, a.length()-b.length());
		
		a = a.substring(b.length());
		
		System.out.println(b  + "--- "+ a);
		
	}

}
