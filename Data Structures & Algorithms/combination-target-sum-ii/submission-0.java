class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);

        List<List<Integer>> list = new ArrayList<>();

        List<Integer> res = new ArrayList<>();
        Arrays.sort(candidates);

        compute(candidates,target,0,list,res);

        return list;

    }

    public static void compute(int[] nums,int t,int i,List<List<Integer>> list,List<Integer> res){

        if(t == 0){
            list.add(new ArrayList<>(res));
            return;
        }
        
       
        for(int index = i; index < nums.length; index++){

            if(index > i && nums[index] == nums[index - 1]){
                continue;
            }

            if(nums[index] > t){
                continue;
            }

            res.add(nums[index]);

            compute(nums,t-nums[index],index+1,list,res);

            res.remove(res.size()-1);
            
        }

    }

}
