class Solution {
    public List<List<Integer>> subsets(int[] nums) {

        List<List<Integer>> list = new ArrayList<>();
        List<Integer> res = new ArrayList<>();

        compute(list,res,nums,0);

        return list;

    }

    public static void compute(List<List<Integer>> list,List<Integer> res,int[] nums,int i){

        if(i == nums.length){
            list.add(new ArrayList<>(res));
            return;
        }

        res.add(nums[i]);

        compute(list,res,nums,i+1);

        res.remove(res.size()-1);

        compute(list,res,nums,i+1);

    }

}
