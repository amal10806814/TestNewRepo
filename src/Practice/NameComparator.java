package Practice;

import java.util.Comparator;

public class NameComparator implements Comparator<Student> {
	

	public int compare(Student s1 , Student s2)
	{
		String a = s1.getName();
		String b = s2.getName();
		
		return a.compareTo(b);
	}

}
