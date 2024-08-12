package graphalgorithm;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class provience {
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
		 boolean vis[] = new boolean [adj.size()];
		 ArrayList<Integer> bfs = new ArrayList<>();
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
	}

}
