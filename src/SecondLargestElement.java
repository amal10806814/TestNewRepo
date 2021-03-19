
public class SecondLargestElement {
	
	
	public static void main(String[] args) {
		
		int[] x = {4,3,7,6,10,14,2,1};
		
		secondLargest(x);
	}
	
	
	public static void secondLargest(int[] a)
	{
		
		Integer first = Integer.MIN_VALUE;
		Integer second = Integer.MIN_VALUE;
		
		for(int i=0; i < a.length ; i++)
		{
			
			if(a[i]> first) //3 4
			{
				second = first;
				
				first = a[i]; //4
			}
			
			else if(a[i]<first&& a[i]>second && a[i]!=first)
			{
				second = a[i];
			}
			
			else
			{
				System.out.println("not found");
			}
			
		}
		
		System.out.println(second);
	}

}
