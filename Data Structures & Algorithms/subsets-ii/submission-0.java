class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        
        Arrays.sort(nums);

        List<List<Integer>> list = new ArrayList<>();
        List<Integer> res = new ArrayList<>();

        compute(0,nums,res,list);

        return list;

    }

    public static void compute(int index,int[] nums,List<Integer> res,List<List<Integer>> list){

        list.add(new ArrayList<>(res));

        for(int i = index; i<nums.length; i++){

            if(i > index && nums[i] == nums[i-1]){
                continue;
            }

            res.add(nums[i]);

            compute(i+1,nums,res,list);

            res.remove(res.size()-1);

        }

    }

}
