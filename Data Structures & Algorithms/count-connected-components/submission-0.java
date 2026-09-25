class Solution {
    public int countComponents(int n, int[][] edges) {

        ArrayList<ArrayList<Integer>> list = new ArrayList<>();

        for(int i = 0; i<=n; i++){
            list.add(new ArrayList<>());
        }

        for(int[] num : edges){
            int u = num[0];
            int v = num[1];
            list.get(u).add(v);
            list.get(v).add(u);
        }

        boolean[] vis = new boolean[n+1];

        int ans = 0;

        for(int node = 0; node<n; node++){
            if(!vis[node]){
                compute(list,node,vis);
                ans += 1;
            }
        }

        return ans;

    }

    public static void compute(ArrayList<ArrayList<Integer>> list,int node,boolean[] vis){

        vis[node] = true;

        for(int neigh : list.get(node)){
            if(!vis[neigh]){
                compute(list,neigh,vis);
            }
        }


    }

}
