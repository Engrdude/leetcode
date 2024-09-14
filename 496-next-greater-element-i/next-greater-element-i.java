class Solution {
    public static int nxtGreat(int k,int arr[])
    {
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]>k)
            return arr[i];
        }
        return -1;
    }
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        
        int nArr[]=new int[nums1.length];
        int k=0;
        for(int i=0;i<nums1.length;i++)
        {
           for(int j=0;j<nums2.length;j++)
           {
              if(nums1[i]==nums2[j])
                {
                  
                  nArr[k++]=nxtGreat(nums2[j],Arrays.copyOfRange(nums2, j + 1, nums2.length));
                  break;
                 }
            }
        }
        return nArr;
        
    }
}