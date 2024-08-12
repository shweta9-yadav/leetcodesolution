package arraysalgorithm;

import java.util.ArrayList;

public class matrix {
	public static void main(String[] args) {
		int[][] a = {{1,2,3,4},{5,6,7,8},{9,10,11,12}};
		ArrayList<Integer> t = new ArrayList<>();
		int r=a.length;
		int c = a[0].length;
		int top=0,down=r-1;
		int left=0,right=c-1;
		int dir =0;
		while(top<=down && left <=right) {
			
			if(dir==0) {
				for(int i=left;i<=right;i++) {
					t.add(a[top][i]);
					System.out.println("a[top][i]"+a[top][i]);
				}
				top++;
			}
			if(dir==1) {
				for(int i=top;i<=down;i++) {
					t.add(a[i][right]);
					System.out.println("(a[i][right]"+a[i][right]);
				}
				right--;
			}
			if(dir==2) {
				for(int i=right;i>=left;i--) {
					t.add(a[down][i]);
					System.out.println("a[down][i]"+a[down][i]);
				}
				down--;
			}
			if(dir==3) {
				for(int i=down;i>=top;i--) {
					t.add(a[i][left]);
					System.out.println("a[i][left]"+a[i][left]);
				}
				left++;
			}
			dir++;
			if(dir==4) {
				dir=0;
			}
		}
	}

}
