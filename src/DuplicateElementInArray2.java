import java.util.HashSet;

public class DuplicateElementInArray2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] a ={4,5,6,7,4,6,10};
		
		HashSet<Integer> hs = new HashSet<Integer>();
		
		for(int element : a)  //O(n)
		{
			if(!hs.add(element))
			{
				System.out.println(element);
			}
		}
		
		System.out.println(hs);
	}

}
