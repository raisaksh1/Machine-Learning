import java.util.ArrayList;
import java.util.Queue;
import java.util.LinkedList;
class BFS{

    public ArrayList<Integer> bfsofgraph(int V, ArrayList<ArrayList<Integer>> adj)
    {
        ArrayList<Integer> bfs = new ArrayList<>();
        boolean vis[] = new boolean[V];
        Queue <Integer> q = new LinkedList<>();

        q.add(0);
        vis[0] = true;

        while(!q.isEmpty()){
            Integer node = q.poll();
            bfs.add(node);

            for(Integer it : adj.get(node))
            {
               if(vis[it] == false) 
               {
                vis[it] = true;
                q.add(it);
               }
            }

        }


    }

    public static void main(String[] args)
    {
        public ArrayList<Integer>
    }

}