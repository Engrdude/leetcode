class Solution {
    public void swap(int []arr,int a,int b)
    {
        int temp=arr[a];
        arr[a]=arr[b];
        arr[b]=temp;
    }
    public void moveZeroes(int[] nums) {
        int j=-1;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]==0)
              {
                j=i;
                break;
              }
        }
        for(int i=j+1;i<nums.length;i++)
        {
            if(j==-1)
            break;
            else if(nums[i]!=0)
            {
                swap(nums,j,i);
                j++;
            }
        }
        
    }
}