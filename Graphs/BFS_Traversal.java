
import java.util.*;

class Main {

    public static ArrayList<Integer> bfs(int V, int[][] edges) {

        // Step 1: Create adjacency list
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();

        for(int i = 0; i < V; i++) {
            adj.add(new ArrayList<>());
        }

        // Step 2: Add edges (undirected graph)
        for(int i = 0; i < edges.length; i++) {
            int u = edges[i][0];
            int v = edges[i][1];

            adj.get(u).add(v);
            adj.get(v).add(u);
        }

       
        // Step 3: BFS traversal
        ArrayList<Integer> bfs = new ArrayList<>();
        Queue<Integer> q = new LinkedList<>();
        boolean[] vis = new boolean[V];
        
        q.add(0);
        vis[0] = true;
        
        while(!q.isEmpty()){

            int val = q.poll();
            bfs.add(val);
            

            for(int it : adj.get(val)){
                if(!vis[it]){
                    q.add(it);
                    vis[it]=true;
                }
            }
        }
        return bfs;
    }

    public static void main(String[] args) {

        int V = 5;

        int[][] edges = {
            {0, 1},
            {0, 2},
            {1, 3},
            {1, 4}
        };

        ArrayList<Integer> ans = bfs(V, edges);

        System.out.println(ans);
    }
}
