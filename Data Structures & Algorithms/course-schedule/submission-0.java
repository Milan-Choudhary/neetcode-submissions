class Solution {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();

        for(int i = 0; i<=numCourses; i++){
            list.add(new ArrayList<>());
        }

        int[] indegree = new int[numCourses+1];

        for(int[] arr : prerequisites){
            int a = arr[0];
            int b = arr[1];
            
            list.get(b).add(a);

            indegree[a] += 1;

        }

        Queue<Integer> q = new LinkedList<>();

        for(int i = 0; i<indegree.length; i++){
            if(indegree[i] == 0){
                q.add(i);
            }
        }

        while(!q.isEmpty()){

            int course = q.poll();

            for(int ele : list.get(course)){
                indegree[ele] -= 1;
                if(indegree[ele] == 0){
                    q.add(ele);
                }
            }

        }

        for(int i = 0; i<indegree.length; i++){
            if(indegree[i] != 0){
                return false;
            }
        }

        return true;

    }
}
