class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer>num=new HashSet<>();
        int n=nums.length;
        if(n==0)
        return 0;
        for(int i=0;i<nums.length;i++)
        {
            num.add(nums[i]);
        }
        int longest=1;
        for(int it:num)
        {
            if(!num.contains(it-1))
            {
                int cnt=1;
                int x=it;
                while(num.contains(x+1)){
                    x=x+1;
                    cnt=cnt+1;
                }
                longest=Math.max(longest,cnt);
            }     
        
    }
    return longest;
}
}