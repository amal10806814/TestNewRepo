import java.util.ArrayList;
import java.util.HashSet;

public class RemoveDuplicateFromArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Integer> al = new ArrayList<Integer>();
		
		al.add(10);
		al.add(20);
		al.add(30);
		al.add(10);
		al.add(40);
		al.add(20);
		
		removeDuplicate(al);
		
	}
		public static void removeDuplicate(ArrayList l)
		{
		
		HashSet<Integer> hs = new HashSet<Integer>(l);
		
		System.out.println(hs);
		
		}

		
	}
	

