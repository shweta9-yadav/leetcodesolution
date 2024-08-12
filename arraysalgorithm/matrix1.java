package arraysalgorithm;


import java.util.ArrayList;
public class matrix1 {
	public static void main(String[] args) {
		int [][] a= {{1,2,3},{4,5,6},{7,8,9}};
		ArrayList<Integer> t = new ArrayList<>();
		int top=0;
		int r = a.length;
		int c= a[top].length;
		int dir = 0;
		
		int left=0;
		System.out.println("----"+a[1][1]);
		while(r>top) {
		if(dir==0) {
		for(int i=0;i<=c-1;i++) {
			System.out.println(a[top][i]+"---"+top);
			t.add(a[top][i]);
		}
		top++;
		}
		if(dir==1) {
			System.out.println("c"+top);
			for(int i=c-1;i>=0;i--) {
				System.out.println(a[top][i]+"---"+top);
				t.add(a[top][i]);
			}
			top++;
		}
		dir++;
		
		if(dir==2) {
			dir=0;
		}
		}
	}
	

}
