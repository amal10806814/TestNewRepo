
public class NoIsBinaryOrNot {

	public static void main(String[] args) {
		
		int x = 103101;
		
		if(!callBinary(x))
		
		{
			System.out.println("not binary");
		}
		
		else
		{
			System.out.println("binary");
		}
	}
	
	public static boolean callBinary(int a)
	{
		
		int b = 0 ;
		//int sum = 0;
		
		boolean flag = true;
		
		while(a>0)
		{
			
			b = a%10;  //1
			
			if(b!=1 && b!=0)
			{
				
				flag = false;
				break;
			}
			
			else
			{
				
				a = a/10 ;
			}
		
			
		}
		
		return flag;
		
	
	}
	
	

}
