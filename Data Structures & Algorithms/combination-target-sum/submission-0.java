class Solution {
    public List<List<Integer>> combinationSum(int[] nums, int target) {
        
        List<List<Integer>> list = new ArrayList<>();

        List<Integer> res = new ArrayList<>();

        compute(list,res,0,nums,target);

        return list;

    }

    public static void compute(List<List<Integer>> list,List<Integer> res,int i,int[] nums,int target){

        if(target == 0){
            list.add(new ArrayList<>(res));
            return;
        }

        if(target < 0 || i >= nums.length){
            return;
        }

        res.add(nums[i]);
        compute(list,res,i,nums,target-nums[i]);
        res.remove(res.size()-1);

        compute(list,res,i+1,nums,target);
        

    }

}
