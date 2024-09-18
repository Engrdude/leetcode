class Solution {
    public void sortColors(int[] nums) {
      int count0=0;
      int count1=0;
      int count2=0;
      for(int i=0;i<nums.length;i++)
      {
        if(nums[i]==0)
        count0++;
        else if(nums[i]==1)
        count1++;
        else
        count2++;
      }
      int i=0,j=0,k=0;
    
      for(i=0;i<count0;i++)
      nums[i]=0;
      for(j=i;j<count1+count0;j++)
      nums[j]=1;
      for(k=j;k<nums.length;k++)
      nums[k]=2;

    }
}