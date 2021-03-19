import java.util.Arrays;

public class StringPreservingSpaces {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s = "I Am Not String";
		
		int length = s.length();
		
		stringReverse(s, length);
	}
	
	static void stringReverse(String s , int length)
	   {
   
         
        char[] inputStringArray = s.toCharArray();
         
         
        char[] resultArray = new char[inputStringArray.length];
         
        //First for loop : 
        //For every space in the 'inputStringArray', 
        //we insert spaces in the 'resultArray' at the corresponding positions 
         
        for (int i = 0; i < inputStringArray.length; i++) 
        {
            if (inputStringArray[i] == ' ') 
            {
                resultArray[i] = ' ';
            }
        }
         
        System.out.println(Arrays.toString(resultArray));
        //Initializing 'j' with length of resultArray
         
        int j = resultArray.length-1;
                 
        //Second for loop :
        //we copy every non-space character of inputStringArray 
        //from first to last at 'j' position of resultArray
         
        for (int i = 0; i < inputStringArray.length; i++)
        {
            if (inputStringArray[i] != ' ') 
            {
                //If resultArray already has space at index j then decrementing 'j'
                 
                if(resultArray[j] == ' ')
                {
                    j--;
                }
                 
                resultArray[j] = inputStringArray[i];
                 
                j--;
            }
        }
         
     
	}
}


