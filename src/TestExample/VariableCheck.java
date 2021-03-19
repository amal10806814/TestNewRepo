package TestExample;

public class VariableCheck {
	
	int a = 20;
	
	public void method()
	{
		int b;    
		b= a+10;
		System.out.println(b);
	}
	
	void method2()
	{
		a = b;
	}

	public static void main(String[] args) {
		
		VariableCheck x = new VariableCheck();
		
		x.method();
		x.b;
		

	}

}
