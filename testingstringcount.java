import java.util.*;
public class testingstringcount {
	public static void main(String[] args) {
//		String str ="aaaaatllluuuddd";
//		String[] str1 = str.split("");
//		int count =1;
//		HashMap<String,Integer> dat = new HashMap<>();
//		for(String s2:str1) {
//			System.out.println(dat.keySet()+"-");
//			if(dat.keySet().contains(s2)) {
//				dat.put(s2, dat.get(s2)+1);
//			}
//			else {
//				dat.put(s2, count);
//			}
//		}
//		dat.forEach((key,value)->{
//			System.out.println(key+"---"+value);
//		});
//		String[] str = {"java","datas","taddys"};
//		String max = str[0];
//		for(int i =1;i<str.length;i++) {
//			int length = str[i].length();
//			if(max.length()<length) {
//				max=str[i];
//			}
//		
//			
//		}
//		System.out.println(max);
//		String str="1";
//		String str1 ="";
//		for(int i=str.length()-1;i>=0;i--) {
//			str1+=""+str.charAt(i);
//			
//		}
//		System.out.println(str1);
		Integer[] in = {1,2,3,4,4};
		int[] a = new int[in.length];
		HashSet<Integer> data = new HashSet<>();
		int i =0;
		for (Integer s1:in ) {
			
			
			if(!data.contains(s1)) {
				data.add(s1);
				a[i]=s1.intValue();
				i++;
			}
			
		}
		for(int j :a) {
			System.out.println(j);
		}
		
		
	}

}
