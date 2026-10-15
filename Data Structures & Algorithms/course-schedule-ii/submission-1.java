class Solution {
    public int[] findOrder(int numCourses, int[][] prerequisites) {
        
        int[] ans = new int[numCourses];

        ArrayList<ArrayList<Integer>> list = new ArrayList<>();

        for(int i = 0; i<numCourses; i++){
            list.add(new ArrayList<>());
        }

        int[] depends = new int[numCourses];

        for(int[] arr : prerequisites){
            list.get(arr[1]).add(arr[0]);

            depends[arr[0]] += 1;

        }

        Queue<Integer> q = new LinkedList<>();

        for(int i = 0; i<depends.length; i++){
            if(depends[i] == 0){
                q.add(i);
            }
        }


        int index = 0;

        while(q.size() > 0){
            int val = q.poll();
            ans[index++] = val;

            for(int ele : list.get(val)){

                depends[ele] -= 1;

                if(depends[ele] == 0){
                    q.add(ele);
                }

            }

        }


         for(int i = 0; i<depends.length; i++){
           if(depends[i] != 0){
            return new int[]{};
           }
        }



        return ans;


    }
}
