class Solution {
    public List<List<Integer>> permute(int[] nums) {
        
        List<List<Integer>> list = new ArrayList<>();

        List<Integer> res = new ArrayList<>();

        compute(list,res,nums);

        return list;

    }

    public static void compute(List<List<Integer>> list,List<Integer> res,int[] nums){

        if(res.size() == nums.length){
            list.add(new ArrayList<>(res));
            return;
        }

        for(int i = 0; i<nums.length; i++){

            if(res.contains(nums[i])){
                continue;
            }

            res.add(nums[i]);

            compute(list,res,nums);

            res.remove(res.size()-1);

        }

    }

}
