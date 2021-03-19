package Practice;

public class FindSumInArray {

	public static void main(String[] args) {
		
		int x[]= {11,15,6,8,9,10};  //6 8 9 10 11 15
		
		int num = 18;
		
		System.out.println(sumMethod(x, num));

	}
	
	static boolean sumMethod(int [] a, int sum )
	{
		int n = a.length;
		boolean flag = false ;
		int i ;
		
		for(i =0 ; i < a.length ; i++)
		{
			if(a[i]>a[i+1])
			{
				break ;
			}
		}
		
		int l = i+1;
		int r = i;
		
		while(l!=r)
		{
			
			if(a[l]+ a[r]== sum)
			{
				flag = true;
				
				return flag;
			}
			else if(a[l]+a[r]> sum)
			{
				r = (n + r-1)%n ;
			}
			
			else if(a[l]+a[r]<sum)
			{
				l = (l+1)%n;  //3
			}
			
			
		}
		
		return flag;
		
		
	}
	
	

}
