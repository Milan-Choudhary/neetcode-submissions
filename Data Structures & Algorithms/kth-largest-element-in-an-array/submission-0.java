class Solution {
    public int findKthLargest(int[] nums, int k) {
        
        PriorityQueue<Integer> pq = new PriorityQueue<>((a,b) -> b - a);


        for(int ele : nums){
            pq.add(ele);
        }

        while(k > 1){
            pq.poll();
            k -= 1;
        }

        return pq.poll();


    }
}
