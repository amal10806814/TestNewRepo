import java.util.Arrays;

public class PairOfElement {

	public static void main(String[] args) {
		int [] a = {4, 5, 7, 11, 9, 13, 8, 12};
		
		int l = 0;
		int r = a.length-1;
		
		int num = 20;
		
		pairElement(a, l, r, num);

	}
	
	public static void pairElement(int[] x,int l, int r , int n)
	{
		
		Arrays.sort(x);// (4, 5, 7, 8, 9, 11, 12, 13)
		
		int low = l;
		int high = r;
		
		boolean flag = false;
		
		while(low<high)
		{
			if(x[low]+x[high]==n)
			{
				System.out.println(x[low]+","+ x[high]);
				low++;
				
			}
			
			else if(x[low]+x[high]>n)
			{
				high--;
			}
			
			else if (x[low]+x[high]< n)
			{
				low++;
			}
			

		}
		
	}

}
