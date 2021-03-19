import java.util.ArrayList;
import java.util.Collections;

public class SecondLargestNo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] a = {6,4,7,8,9,1,22,13};
		
		ArrayList<Integer> al = new ArrayList<Integer>();
		
		for(int x : a)
		{
			al.add(x);
		}
			
		Collections.sort(al);
		
		int size = al.size();
		
		System.out.println(al.get(size-2));
	}

}
