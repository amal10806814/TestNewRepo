import java.util.Arrays;

public class EqualityOfTwoArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] a = {2,5,8,9,12};
		int[] b = {2,5,8,9,12};
		
		
	for(int i =0; i<a.length;i++) //O(n)
	{
		if(a[i]!=b[i])
		{
			System.out.println("not equal");
		}
		else
		{
			continue;
		}

	}
	
	System.out.println("arrays are equal");
	
	//if two arrays are not in same order
//	Arrays.sort(a);
//	Arrays.sort(b);
//	
//	Arrays.equals(a, b);	
	
//	Arrays.deepEquals(a, b) // for multi dimensional array
	}
	
	
	
		

}
