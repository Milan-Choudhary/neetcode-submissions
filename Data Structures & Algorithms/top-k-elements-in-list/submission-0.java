class Solution {
    class Pair{
        int val;
        int freq;

        Pair(int v, int f){
            val = v;
            freq = f;
        }
    }

    public int[] topKFrequent(int[] nums, int k) {
        
        HashMap<Integer,Integer> map = new HashMap<>();

        for(int ele : nums){
            map.put(ele,map.getOrDefault(ele,0)+1);
        }

        PriorityQueue<Pair> pq = new PriorityQueue<>((a,b) -> b.freq - a.freq);

       for(Map.Entry<Integer,Integer> entry : map.entrySet()){
         pq.add(new Pair(entry.getKey(),entry.getValue()));
       }

        int[] res = new int[k];
        int index = 0;

       while(k > 0){
        Pair p = pq.poll();
        res[index] = p.val;
        k -= 1;
        index += 1;
       }

       return res;

    }
}
