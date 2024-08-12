package graphalgorithm;
import java.util.*;
//recurssion
public class depthfirstsearch {
public static void main(String[] args) {
	 ArrayList<ArrayList<Integer>> adj = new ArrayList<>(
	            Arrays.asList(
	                new ArrayList<>(Arrays.asList(2,3,1)),
	                new ArrayList<>(Arrays.asList(0)),
	                new ArrayList<>(Arrays.asList(0,4)),
	                new ArrayList<>(Arrays.asList(0)),
	                new ArrayList<>(Arrays.asList(2))
	            )
	        );
	 
	 int v=5;
	 depthfirstsearch d = new depthfirstsearch();
	 ArrayList<Integer> t=d.graphdfs(v,adj);
	 
	 
	 
}

private ArrayList<Integer> graphdfs(int a,ArrayList<ArrayList<Integer>> adj) {
	// TODO Auto-generated method stub
	ArrayList<Integer> t = new ArrayList<>();
	boolean[] vis= new boolean[a+1];
	vis[0] = true;
	dfs(0,vis,adj,t);
	return t;
}

private void dfs(int i, boolean[] vis, ArrayList<ArrayList<Integer>> adj, ArrayList<Integer> t) {
	vis[i]=true;
	t.add(i);
	for(Integer a:adj.get(i)) {
		if(vis[a]==false) {
			dfs(a,vis,adj,t);
		}
	}
	
}


}

