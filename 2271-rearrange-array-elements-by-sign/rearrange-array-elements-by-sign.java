class Solution {
    public int[] rearrangeArray(int[] nums) {
       /* ArrayList<Integer>list1=new ArrayList<>();
        ArrayList<Integer>list2=new ArrayList<>();
        int k=0,j=0;
        for(int i=0;i<nums.length;i++)
       {
        if(nums[i]>0)
        {
        list1.add(j,nums[i]);
        j++;
        }
        if(nums[i]<0)
        {
            list2.add(k,nums[i]);
            k++;
        }
       }
       j=0;
       for(int i=0;i<nums.length/2;i++)
       {
         nums[j]=list1.get(i);
         j++;
         nums[j]=list2.get(i);
         j++;
       } */
       int posIndex=0;
       int negIndex=1;
       int []ans=new int[nums.length];
       for(int i=0;i<nums.length;i++)
       {
        if(nums[i]>0)
        {
            ans[posIndex]=nums[i];
            posIndex+=2;
        }
        if(nums[i]<0)
        {
            ans[negIndex]=nums[i];
            negIndex+=2;
        }
       }

       return ans;
        
    }
}