class Solution {
    public int[][] insert(int[][] intervals, int[] newInterval) {
        ArrayList<int[]>list=new ArrayList<>();
        int idx=0;
        while(idx<intervals.length)
        {
            if(intervals[idx][0]<newInterval[0])
            {
                list.add(intervals[idx]);
                idx++;
            }
            else
            {
                break;
            }
        }
        if(list.size()==0||(newInterval[0]>list.get(list.size()-1)[1]))
        {
            list.add(newInterval);
        }
        else
        {
            int lastInterval []=list.get(list.size()-1);
            lastInterval[1]=Math.max(lastInterval[1],newInterval[1]);
        }
        while(idx<intervals.length)
        {
            int lastInterval[]=list.get(list.size()-1);
            if(lastInterval[1]>=intervals[idx][0])
            {
             lastInterval[1]=Math.max(lastInterval[1],intervals[idx][1]);   
            }
            else
            {
                list.add(intervals[idx]);
            }
            idx++;
        }
        return list.toArray(new int[list.size()][]);
        
    }
}