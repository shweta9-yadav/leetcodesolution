package tested;

public class increasingminimumoperation {

	public static void main(String[] args) {
		  String s= "zzaza";
		  int count=0;
		  int flag=0;
		 while(s.length()>0) {
		  if(ispalindrome(s)) {
			  flag=1;
			  break;
		  }
		  else {
			  count++;
			  s=s.substring(0,s.length()-1);
			
		  }
		 }
		 if (flag == 1) {
	            System.out.println("--"+count);
	        }
	        
	        
	        }
	public static boolean ispalindrome(String s) {
		int l = s.length();
		for(int i=0,j=l-1;i<=j;i++,j--) {
			if(s.charAt(i)!=s.charAt(j)) {
				return false;
			}
		}
		return true;
		
	}
	       
	}

