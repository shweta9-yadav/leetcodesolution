package graphalgorithm;
import java.util.*;

public class breadthfirstsearch {
//level wise
	public static void main(String[] args) {
		 ArrayList<ArrayList<Integer>> adj = new ArrayList<>(
		            Arrays.asList(
		                new ArrayList<>(Arrays.asList(1, 2, 3)),
		                new ArrayList<>(Arrays.asList()),
		                new ArrayList<>(Arrays.asList(4)),
		                new ArrayList<>(Arrays.asList()),
		                new ArrayList<>(Arrays.asList())
		            )
		        );
//		 int v=5;
		 System.out.println();
	ArrayList<Integer> bfs = new ArrayList<>();
//	System.out.println(adj.size());
	boolean vis[] = new boolean[adj.size()];
	Queue<Integer> q = new LinkedList<>();
	vis[0] =true;
	q.add(0);
	
	while(!q.isEmpty()) {
		Integer node= q.poll();
		System.err.println("=="+node);
		bfs.add(node);
		for(Integer t:adj.get(node)) {
			if(!vis[t]) {
				vis[t]=true;
				q.add(t);
			}
		}
	}
	for(int i=0;i<bfs.size();i++) {
		System.out.println(bfs.get(i));
	}
	
	}
	
}
