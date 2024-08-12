package tested;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


class Reverse
{
    // Complete the function
    // str: input string
    public static String reverseWord(String str)
    {
        String strs ="";
     //   System.out.println(str.length());
        char ch;
        for(int i=str.length()-1;i>=0;i--){
       	System.out.println(i);
        	System.out.println(str.charAt(i));
            ch= str.charAt(i);
            strs= ""+ch;
         
         // System.out.println(str);
          // System.out.print(strs);
        }
       
        return strs;
       // return strs;
        // Reverse the string str
    }
    
}
class counts{
	public static void main(String[] args) throws Exception, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Integer t = br.readLine().length();
		while(t>=0) {
			String str = br.readLine();
			System.out.println(new Reverse().reverseWord(str));
		}
		
	}
}