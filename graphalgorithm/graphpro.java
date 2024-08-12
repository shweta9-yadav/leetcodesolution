package graphalgorithm;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.*;

class pair{
	int row;
	int col;
	pair(int row,int col){
		this.row=row;
		this.col= col;
	}
}
public class graphpro {
	public static void main(String[] args) {
//		 ArrayList<ArrayList<Integer>> adj = new ArrayList<>(
//		            Arrays.asList(
//		                new ArrayList<>(Arrays.asList(0,1)),
//		                new ArrayList<>(Arrays.asList(1,0)),
//		                new ArrayList<>(Arrays.asList(1,1)),
//		                new ArrayList<>(Arrays.asList(1,0))
//		            )
//		        );
		int[][] adj = {{0,1},{1,0},{1,1},{1,0}};
		int r = adj.length;
		int c = adj[0].length;
	boolean vis[][] = new boolean[r][c];
	//vis[r][c]=;
	
	Queue<pair> q = new LinkedList<pair>(); 
	q.add(new pair(r,c));
	for(int i =0;i<adj.length;i++) {
		for(int j=0;j<c;j++) {
			
		}
	}
//	vis[0] = true;
//	q.add(0);
//	HashMap<String,String> test = new HashMap<>();
	}

}
