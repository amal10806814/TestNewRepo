
public class ArmstrongNo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int c = 54748;
		
		System.out.println(armstrong(c));
	

	}
	
	public static boolean armstrong(int x)
	{
		int a = 0;
		
		String s =String.valueOf(x);
		
		
		int b =x;
		
		int sum =0;
		
		while(x>0)
		{
			
			 a = x%10; //4
			 
			 int k = 1;
			 
			 for(int i =0 ; i < s.length() ;i++)
			 {
				k = k * a; //4
			 }
			
			 
			 sum = sum + k;
			 
			 x = x/10; //947
		}
		
		if(sum==b)
		{
			return true;
		}
		
		return false;
	}

}
