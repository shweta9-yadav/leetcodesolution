package stringarray;

public class printzigzagpattern {
	public static void main(String[] args) {
		String s="PAYPALISHIRING";
		String[] str = s.split("");
		String data ="";
		 StringBuilder sb = new StringBuilder();
		 int numRows=4;
		 int div = 4/2;
		 int data1 = numRows+div;
		 int index=0;
		 int count=0;
		 for(int i =0 ;i<1;i++) {
//			 System.out.println(str[i]);
			 if(i%2==0) {
				 
				 System.out.println(str[index]);
				 index=i+data1;
				 int len1 = str.length-index;
				 System.out.println(len1);
				 if(len1>=data1) {
					 continue;
				 }
			 }
			 count=i;
			int len = str.length;
//			while(len>0) {
////				System.out.println(len);
////			 if(i%2==0) {
////				
////				 sb.append(str[count]);
////				 count = index+data1;
////				 System.out.println("--"+count);
////		
////			 }
////			 else {
////				 System.out.println("else"+str[count]);
////				 sb.append(str[count]);
////				 count = index+data1-div;
////			 }
//			len=len - count;
//			
//			 
//			}
			
			 
		 }
		
		System.out.println("--"+sb);
        
      
	}

}





