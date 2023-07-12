class Solution {
    public List<Integer> eventualSafeNodes(int[][] graph) {
        boolean[] safeNodes = new boolean[graph.length];
        findSafeNodes(safeNodes, graph);

        List<Integer> finalSafeNodes = new ArrayList<>();
        for(int i = 0; i < graph.length; i++){
            boolean isSafeNode = true;
            if(!safeNodes[i]){
                for(int j = 0; j < graph[i].length; j++){
                    boolean[] visited = new boolean[graph.length];
                    visited[i] = true;
                    if(!dfs(graph[i][j], visited, safeNodes, graph)){
                        isSafeNode = false;
                        break;
                    }                    
                }
                if(isSafeNode){
                    safeNodes[i] = true;
                }
            }
        }

        for(int i = 0; i < safeNodes.length; i++){
            if(safeNodes[i]){
                finalSafeNodes.add(i);
            }
        }
        return finalSafeNodes;
    }


    public boolean dfs(int node, boolean[] visited, boolean[] safeNodes, int[][] graph){
        if(visited[node] == true){
            return false;
        }

        if(safeNodes[node] == true){
            return true;
        }

        visited[node] = true;

        boolean possible = false;
        for(int k = 0; k < graph[node].length; k++){
            possible = dfs(graph[node][k], visited, safeNodes, graph);
            if(!possible){
                break;
            }
        }

        visited[node] = false;
        safeNodes[node] = possible;
        return possible;
    }

    public void findSafeNodes(boolean[] safeNodes, int[][] graph){
        for(int i = 0; i < graph.length; i++){
            if(graph[i].length == 0){
                safeNodes[i] = true;
            }
        }
    }
}