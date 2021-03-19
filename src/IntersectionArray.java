import java.util.ArrayList;
import java.util.HashSet;

public class IntersectionArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] i1 = {1, 2, 3, 4, 5, 4}; //12345

        int[] i2 = {3, 4, 5, 6, 7, 4};
        
        intersection(i1,i2);

	}
	
	static void intersection(int[]a , int[]b)
	{
		
		HashSet<Integer> hs = new HashSet<Integer>();
		
		HashSet<Integer> hs1 = new HashSet<Integer>();

		ArrayList<Integer> al = new ArrayList<Integer>();
		
		for(int i = 0; i <a.length; i++)
			
		{
			hs.add(a[i]);
			
		}
		
		for(int i = 0; i <b.length; i++)
			
		{
			hs1.add(b[i]);
			
		}
		
		hs.retainAll(hs1);
		
		System.out.println(hs);
			
			
		}
	
		
	}

