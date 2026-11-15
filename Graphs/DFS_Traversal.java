
import java.util.*;

class Main {
// recursive
    public static void dfs(int node, ArrayList<ArrayList<Integer>> adj,
                           boolean[] visited,ArrayList<Integer> dfs) {

        visited[node]=true;
        dfs.add(node);

        for(int it : adj.get(node)){
            if(!visited[it]){
                dfs(it,adj,visited,dfs);
            }
        }     
    }

    public static void main(String[] args) {

        int V = 5;

        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();

        for (int i = 0; i < V; i++) {
            adj.add(new ArrayList<>());
        }

        // Undirected edges
        adj.get(0).add(1);
        adj.get(1).add(0);

        adj.get(0).add(2);
        adj.get(2).add(0);

        adj.get(1).add(3);
        adj.get(3).add(1);

        adj.get(1).add(4);
        adj.get(4).add(1);

        boolean[] visited = new boolean[V];
        ArrayList<Integer> dfs = new ArrayList<>();

        dfs(0, adj, visited, dfs);

        for(int val : dfs){
            System.out.print(val+" ");
        }
    }
}
