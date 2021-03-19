import java.util.TreeMap;

public class TreeMapImplementation {
	
	public static void main(String[] args) {
		
		TreeMap t = new TreeMap(new MyComparator());
		
		t.put("xxx", 101);
		t.put("yyy", 120);
		t.put("zzz", 122);
		t.put("bbb", 343);
		
		System.out.println(t);
	}

}
