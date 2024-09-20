class Solution {
   /* public static int greatest_elem(int []nums,int s)
    {
       int max=nums[s];
        for(int i=s+1;i<nums.length;i++)
        {
            if(nums[i]>max)
            max=nums[i];
        }
        return max;
    }*/
    public int[] replaceElements(int[] arr) {
       /* int [] ans=new int[arr.length];
        int i=0;
        for(i=0;i<arr.length-1;i++)
        {
            ans[i]=greatest_elem(arr,i+1);

        }
        ans[i]=-1;
         
         return ans;*/

         int max=Integer.MIN_VALUE;
         int []ans =new int[arr.length];
         ans[arr.length-1]=-1;
         for(int i=arr.length-1;i>0;i--)
         {
            if(arr[i]>max){
                max=arr[i];
                ans[i-1]=max;
            }
            else
            ans[i-1]=max;
         }
         return ans;

    }
}