class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int left=0;
        int right=0;
        int sum=nums[0];
        int n=nums.length;
        int m=n+1;
        while(right<n)
        {
            while(sum>=target&& right>=left)
            {
                m = Math.min(m, right - left + 1);
                sum-=nums[left];
                left++;      
                  
            }
           right++;
            if(right<n)
            {
            sum+=nums[right];
            }
        }

      return  m == n + 1 ? 0 : m;

        
    }
}