package Practice;

import java.util.Arrays;

public class sumofTwoNumber {

	public static void main(String[] args) {
		
		//int[] a = {10, 2, 4, 8, 20 , 14, 5, 25};  //8\
		
		int []a = {6,  8, 9, 10, 11, 15};

		//int sum = 19;
		
		int sum = 21;
				
		Arrays.sort(a);  //2 4 5 8 10 14 20 25
		
		int l = 0;
		int r = a.length-1;
		
		while(l<r)
		{
			if(a[l]+a[r]==sum)
			{
				System.out.println(a[l] +", "+ a[r]);
				l++;
			}
			
			else if (a[l]+a[r]>sum)
			{
				r--;
			}
			
			else
			{
				l++;
			}
		}

}
}
