class Solution {
    private int minutes(String time)
    {
        String [] parts=time.split(":");
        int hours=Integer.parseInt(parts[0]);
        int minutes=Integer.parseInt(parts[1]);

        return (hours*60+minutes);
    }
    public int findMinDifference(List<String> timePoints) {
        if(timePoints.size()>1440)
        return 0;

        ArrayList<Integer>list=new ArrayList<>();
        for(String time:timePoints)
        {
            list.add(minutes(time));
        }
        Collections.sort(list);
        int minDiff=Integer.MAX_VALUE;

        for(int i=1;i<list.size();i++)
        {
            minDiff=Math.min(minDiff,list.get(i)-list.get(i-1));

        }
        int cirMinDiff=(1440+list.get(0)-list.get(list.size()-1)) %1440;
         minDiff=Math.min(cirMinDiff,minDiff);

         return minDiff;
        
    }
}