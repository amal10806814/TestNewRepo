package Interview;

import java.util.ArrayList;
import java.util.HashSet;

public class ArrayListNew {

	public static void main(String[] args) {
		
		
		ArrayList<Integer> al = new ArrayList<>();
		
		al.add(1);
		al.add(2);
		al.add(3);
		al.add(4);
		al.add(5);
		al.add(3);
		al.add(3);
		
		HashSet<Integer> hs = new HashSet<>();
		
		int count = 0;
		
		for(int x : al)
		{
			if(!hs.add(x))
			{
				System.out.println(x);
				count ++;
				
			}
			
			if(count>1)
			{
				
			}
		}
		
		

	}

}
