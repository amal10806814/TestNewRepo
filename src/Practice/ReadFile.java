package Practice;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;

public class ReadFile {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		
		
		BufferedReader obj = new BufferedReader(new FileReader("/Users/Chaudhary/Documents/testNew.txt"));
		
		ArrayList<String> al = new ArrayList<String>();
		
		String currentLine = obj.readLine();
		
		while(currentLine!=null)
		{
			al.add(currentLine);
			
			currentLine = obj.readLine();
		}
		
		System.out.println(al);
		
		
		Collections.sort(al);
		
		System.out.println(al);
		
		BufferedWriter bw = new BufferedWriter(new FileWriter("/Users/Chaudhary/Documents/testFinal.txt"));
		
		for(String line : al)
		{
			bw.write(line);
			bw.newLine();
		}
		
		bw.close();
		
		

	}

}
