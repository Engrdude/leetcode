class Solution {
    public int removeDuplicates(int[] nums) {
        int i=0;
        int j=1;
        while(j<nums.length)
        {
             if(nums[i]!=nums[j])
             {
                nums[++i]=nums[j];
                j++;
             }
             else
             {
                j++;
             }
        }
        return (i+1);
        
    }
}