class Solution {

    public static class Pair{
        int a;
        int b;
        double dist;

        Pair(int a,int b,double dist){
            this.a = a;
            this.b = b;
            this.dist = dist;
        }
    }

    public int[][] kClosest(int[][] points, int k) {
        
        PriorityQueue<Pair> pq = new PriorityQueue<>((a,b) -> Double.compare(a.dist,b.dist));

        for(int[] locations : points){
            int a = locations[0];
            int b = locations[1];
            
            double x = (double)Math.pow(a,2);
            double y = (double)Math.pow(b,2);

            double val = x + y;

            double ans = (double)Math.sqrt(val);

            pq.add(new Pair(a,b,ans));

        }

        int[][] answer = new int[k][2];
        int index = 0;

        while(k > 0){

            Pair p = pq.poll();

            answer[index][0] = p.a;
            answer[index][1] = p.b;

            index += 1;
            k -= 1;
        }

        return answer;

    }
}
