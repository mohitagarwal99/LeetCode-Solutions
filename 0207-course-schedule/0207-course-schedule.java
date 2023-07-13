class Solution {
    class Edge{
        int src;
        int dst;
        Edge(int src,int dst){
            this.src=src;
            this.dst=dst;
        }
    }
    public boolean canFinish(int num, int[][] pre) {
        ArrayList<Edge> graph []=new ArrayList[num];
        for(int i=0;i<num;i++){
            graph[i]=new ArrayList<Edge>();
        }
        for(int i=0;i<pre.length;i++){
            graph[pre[i][1]].add(new Edge(pre[i][1],pre[i][0]));
        }
        boolean vis[]=new boolean [num];
        boolean path[]=new boolean [num];
        for(int i=0;i<num;i++){
            if(!vis[i]){
                if(dfs(graph,i,vis,path))return false;
            }
        }
        return true;
    }
    public boolean dfs(ArrayList<Edge> graph [],int curr,boolean vis[],boolean path[]){
        // if already in path i.e cycle detected
        if(path[curr])return true;
        //if visited but not in path
        // not a cycle
        if(vis[curr])return false;

        vis[curr] = true;
        path[curr] = true;
        
        for(int i=0;i<graph[curr].size();i++){
            Edge e=graph[curr].get(i);
            if(dfs(graph,e.dst, vis, path))return true;
        }

        //not included in path now 
        path[curr] = false;
        return false;
    }
    
}