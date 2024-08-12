package stringarray;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;
public class decodeways {
	
	
	public static void main(String[] args) {
		String s ="12";
		HashMap<Integer,String> test = new HashMap<>();
		HashMap<String,Integer> result = new HashMap<>();
		String[] s2=s.split("");
	
		int res=0;
//        for (char ch = 'A'; ch <= 'Z'; ch++) {
//            test.put(String.valueOf(ch),++count);
//        }
        decodeways d = new decodeways();
        List<String> group= new ArrayList<>();
       // generateString(s,"",group);
        int count=0;
        for(int i=0;i<group.size();i++) {
        	count++;
        	test.put(count,group.get(i));
        }
        test.forEach((key, value) -> {
            System.out.println("Key: " + key + ", Value: " + value);
        });
        int d1 = d.getdata(s); 
        System.out.println("d"+d1);
    
		
	}

	private int getdata(String s) {
		 int n = s.length();
	        int[] f = new int[n + 1];
	        f[0] = 1;
	        for (int i = 2; i <= n; i++) {
	            if (s.charAt(i - 1) != '0') {
	                f[i] = f[i - 1];
	            }
	            if (i > 1 && s.charAt(i - 2) != '0' && Integer.valueOf(s.substring(i - 2, i)) <= 26) {
	                f[i] += f[i - 2];
	            }
	        }
	        System.out.println("="+f[n]+"---"+n);
	        return f[n];
		
	}

//	private static void generateString(String s, String string,List<String> t) {
//		// TODO Auto-generated method stub
//		//List<String> t = new ArrayList<>();
//		 if (s.isEmpty()) {
//			 
//	            t.add(string.trim());
//	            System.out.println(t);
//	            return;
//	        }
//		for(int i =1;i<=s.length();i++) {
//			String prefix = s.substring(0,i);
//			String[] split = prefix.split("");
//			
//			//System.out.println(split[0]+"--"+prefix);
//			//if(Integer.valueOf(prefix)>=10) {
//				if(Integer.valueOf(split[0])>0 && Integer.valueOf(prefix)<27) {
//				generateString(s.substring(i),string+" "+prefix,t);
//				}
//			//}
//		}
//		
//	}

}
