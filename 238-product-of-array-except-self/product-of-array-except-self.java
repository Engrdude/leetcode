class Solution {
    public int[] productExceptSelf(int[] nums) {
        int arr1[]=new int[nums.length];
        int arr2[]=new int[nums.length];
        int ans[]=new int[nums.length];
        arr1[0]=nums[0];
        arr2[nums.length-1]=nums[nums.length-1];
        for(int i=1;i<nums.length;i++)
        {
           arr1[i]=arr1[i-1]*nums[i]; 
           arr2[nums.length-i-1]=arr2[nums.length-i]*nums[nums.length-i-1];
        }
        ans[0]=arr2[1];
        ans[nums.length-1]=arr1[nums.length-2];
        for(int i=1;i<nums.length-1;i++)
        {
            ans[i]=arr1[i-1]*arr2[i+1];
        }
       return ans;
        
    }
}