package tested;

import java.util.ArrayList;
import java.util.List;

public class median2arraylist {
public static void main(String[] args) {
		int[] nums1 = {1,2};
		int [] nums2 = {3,4};
	  double a = 0;
      double sum =0;
      ArrayList<Integer> t = new ArrayList<>();
      for(int i=0;i<nums1.length;i++){
          t.add(nums1[i]);
      }
      for(int i =0 ;i<nums2.length;i++){
          t.add(nums2[i]);
      }
     
     for(Integer b :t) {
    	sum +=b;
     }
       if(sum>0){
           a= sum/(double)t.size();
       }
       System.out.println(a);
      
}
}
