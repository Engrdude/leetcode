class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int c1=0,c2=0;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]==1)
            c1++;
            else
            {
                if(c2<c1)
                c2=c1;
                c1=0;
            }
        }
        return (c1>c2?c1:c2);
        
    }
}