package tested;
import java.util.Arrays;
import java.util.HashSet;
import java.util.ArrayList;

public class duplicatearray {
	public static void main(String[] args) {
		int [] arr= {1,2,3,4,4,1};
		ArrayList<Integer> list= new ArrayList<>();
		ArrayList<Integer> list2= new ArrayList<>();
		for(int i:arr) {
			list.add(i);
		}
		for(int i:list) {
			if(!list.contains(list2)) {
				list2.add(i);
			}
		}
		System.out.println(list2);
	
	}

}
