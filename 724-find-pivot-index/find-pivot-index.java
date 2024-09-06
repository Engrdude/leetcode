class Solution {
    public int pivotIndex(int[] nums) {
        int []p=new int[nums.length];
        p[0]=0;
        int sum=nums[0];
        for(int i=1;i<nums.length;i++)
        {
            sum+=nums[i];
            p[i]+=p[i-1]+nums[i-1];
        }
        for(int i=0;i<nums.length;i++)
        {
            if(p[i]==sum-p[i]-nums[i])
                 return i;
        }
      return -1;
        
    }
}