/**
 * Definition of Interval:
 * public class Interval {
 *     public int start, end;
 *     public Interval(int start, int end) {
 *         this.start = start;
 *         this.end = end;
 *     }
 * }
 */

class Solution {

    public class Pair{

        int start;
        int end;

        Pair(int start,int end){
            this.start = start;
            this.end = end;
        }

    }

    public boolean canAttendMeetings(List<Interval> intervals) {

        if(intervals.size() == 0 || intervals.size() == 1){
            return true;
        }

        PriorityQueue<Pair> pq = new PriorityQueue<>((a,b) -> a.start - b.start);

        for(int i = 0; i<intervals.size(); i++){
            Interval I = intervals.get(i);
            int s = I.start;
            int e = I.end;
            pq.add(new Pair(s,e));
        }

        boolean ans = true;

        int e = pq.poll().end;

        while(pq.size() > 0){

            Pair p = pq.poll();
            int s = p.start;

            if(s < e){
                return false;
            }

            e = p.end;

        }

        return true;


    }
}
