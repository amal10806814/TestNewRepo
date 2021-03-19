
public class ContinuousSubArray {
	
	public static void main(String[] args) {
		
		int[] b = {12, 5, 31, 9, 21, 8};
		
		int num = 45;
		
		subArray(b , num);
	}
	
	public static void subArray(int[] a, int n)
	{
		int sum =0;
		int j = 0;
		
		for(int i =0; i < a.length;i++) //4
		{
			
			sum = sum +a[i]; //38
			
			
			while(sum>n && j<=i-1) //2
			{
				sum = sum -a[j]; //9
				j++; //3
			}
			
			if(sum==n)
			{
				break;
			}
		}
		System.out.println(sum);
		
		}
	}

