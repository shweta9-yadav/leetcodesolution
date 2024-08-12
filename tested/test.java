package tested;

import java.util.Scanner;

public class test {
	
	
	
	    	 static boolean isAnagram(String a, String b) {
	    	        // Complete the function
	    	       // String A =(a.toLowerCase()).;
	    	       boolean result=true;
	    	        a.toLowerCase();
	    	        b.toLowerCase();
	    	         int counter[] = new int[130];  
	    	         int counter1[] = new int[130]; 
	    	      if(a.length()==b.length()){
	    	       for (int i = 0; i < a.length(); i++)   
	    	        {  
//	    	            if(!b.contains(a.substring(i))){
//	    	                result=false;
//	    	            }
	    	    	  if(!b.contains(String.valueOf(a.charAt(i)))){
	    	    		  result=false;
	    	    	  }
	    	            counter[(int) a.charAt(i)]++;  
	    	        }  
	    	        for (int i = 0; i < b.length(); i++)   
	    	        {  
	    	            counter1[(int) b.charAt(i)]++;  
	    	        }  
	    	    //print Frequency of characters  
	    	        for (int i = 0; i < 130; i++)   
	    	        {  
	    	            if (counter[i] != 0 && counter1[i]!=0)   
	    	            {  
	    	                if(counter[i]!=counter1[i]){
	    	                    result= false;
	    	                }
	    	             } 
	    	        }  
	    	      }
	    	      else{
	    	          result= false;
	    	      }        
	    	      return result;
	    	    }


	  public static void main(String[] args) {
	    
	        Scanner scan = new Scanner(System.in);
	        String a = scan.next();
	        String b = scan.next();
	        scan.close();
	        boolean ret = isAnagram(a, b);
	        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
	    }
	  public String tested() {
			String s1= "tested";
			return s1;
			
		}
	}

