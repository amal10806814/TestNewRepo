import java.util.Arrays;

public class SelectionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {4,6,3,9,1,8,5};
		
		callingMethod(arr);
	}
	
	static void callingMethod(int[]a)
	{
		int min;
		for(int i =0; i< a.length;i++) //1
		{
			min =i; //1
			
			for(int j = i+1; j<a.length;j++)  //4
			{
				
			if(a[min]<a[j])  // 49
			{
				min = j;  //3
			}
			}
			
			int temp = a[i];  //4
			a[i]=a[min];   //9
			a[min]=temp;  //4
		}
		
		System.out.println(Arrays.toString(a));
	}

}
