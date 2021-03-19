package TestExample;

public class MissingNo {

	public static void main(String[] args) {
		
		int[] arr = {1,2,3,4,5,6,7,8,10}; //55 -9 46
		
		int l = arr.length;
		
		int n = 10;
		int sum = 0;
		
		for(int i =0 ; i < arr.length;i++)
		{
			sum = sum + arr[i];
		}
		
		int sum1 = (n*(n+1))/2; 
		
		int diff = sum1-sum;
		
		System.out.println(diff);

	}

}
