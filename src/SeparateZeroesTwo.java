import java.util.Arrays;

public class SeparateZeroesTwo {

	public static void main(String[] args) {
		
		int[] a = {14, 0, 5, 2, 0, 3, 0};
		
		int j = a.length-1;
		
		for(int i =a.length-1; i >= 0; i--)
		{
	
			{
			if(a[i]!=0)
			{
				a[j]=a[i];  //2
				j--;  //5
			}
			
			else
			{
				continue;
			}
			
			}
		}
		
		while(j>=0){
			
			a[j]=0;
			j--;
			
		}

		System.out.println(Arrays.toString(a));
	}

}
