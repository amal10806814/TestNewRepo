import java.util.Arrays;

public class sparateZeros {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] a = {14, 0, 5, 2, 0, 3, 0};
		
		separteZeroes(a);

	}
	
	public static void separteZeroes(int[] a)
	{
		int j = 0;
		int count = 0;
		
	for(int i =0 ; i < a.length ; i ++)
	{
		if(a[i]!=0){
			
			a[j]=a[i];  // Two pointer technique
			j++;
		}
		
		else
		{
			count ++;
		}
	}
	
	while(count > 0)
	{
		a[j]= 0;
		
		count--;
		j++;
	}
	
	System.out.println(Arrays.toString(a));
	}

}
