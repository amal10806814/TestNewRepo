package Practice;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ReadMultipleColumnOfFile {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		String Read = "/Users/Chaudhary/Documents/testNew.txt";
		
		String Write = "/Users/Chaudhary/Documents/testFinal.txt";
		
		readFileMethod(Read, Write);

	}
	
	
	static void readFileMethod(String a , String b) throws IOException
	{
		
		BufferedReader br = new BufferedReader(new FileReader(a));
		
		List<Student> al = new ArrayList<>();
		
		String s1 = br.readLine();
		
		
		while(s1!=null && s1!="")
		{
			
			String[] s2 = s1.split(" ");
			
			al.add(new Student(s2[0], s2[1]));
			
			s1 = br.readLine();
			
		}
		
	//	System.out.println(al.get(1).getName());
		
		Collections.sort(al , new NameComparator());
		
		BufferedWriter bw = new BufferedWriter(new FileWriter(b));
		
		
		for(Student x : al)
		{
		
			bw.write(x.getName());
			bw.write(x.getMarks());
			bw.newLine();
		}
		
		bw.close();
		
	}

}
