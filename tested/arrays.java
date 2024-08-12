package tested;

import java.util.Arrays;
import java.util.Collections;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class arrays {
	
	
	 public static String reverseWord(String str)
	    {
	        String strs ="";
	        for(int i=str.length()-1;i>=0;i--){

	            strs+=str.charAt(i);
	        }
	        return strs;
	        // Reverse the string str
	    }
	    public static void main(String[] args){
	      
	      System.out.println(reverseWord("test"));
	        
	    }
	

}
