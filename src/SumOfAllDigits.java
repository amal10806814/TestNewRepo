
public class SumOfAllDigits {
	
	public static void main(String[] args) {
		
		
		int a = 23458;
		
		System.out.println(sumAll(a));
		
	}
	
	public static int sumAll(int x)
	{
		
		int b = 0;
		
		int sum = 0;
		
		while(x>0)
		{
			b = x%10;
			
			sum = sum + b;
			
			x = x/10;
		
			
		}
		
		return sum;
	}
}
