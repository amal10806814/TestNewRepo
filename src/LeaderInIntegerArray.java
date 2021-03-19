import java.util.ArrayList;
import java.util.Arrays;

public class LeaderInIntegerArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = {14, 9, 11, 7, 8, 5, 3};
		
		findLeader(arr);
	}
	
	static void findLeader(int[]a)
	{
		
		ArrayList<Integer> al = new ArrayList<Integer>();
		
		
		for(int i =0; i<a.length;i++)
		{
			boolean flag = true ;
			for(int j = i+1 ; j<a.length ; j++)
			{
				if(a[i]<a[j])
				{
					flag = false;
					break;
				}
				
			}
			
			if(flag)
			{
			al.add(a[i]);
			}
			
		}
		
		System.out.println(al);
		
	}

}
