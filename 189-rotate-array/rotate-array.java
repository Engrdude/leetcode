class Solution {
    public void reverse(int []arr,int b,int d)
    {
        while(b<d)
        {
            int temp=arr[b];
            arr[b]=arr[d];
            arr[d]=temp;
            b++;
            d--;
        }
    }
    public void rotate(int[] nums, int k) {
       int n=nums.length;
      
        if(k>n)
        k=k%n;
     if(n>1){
       reverse(nums,n-k,n-1);
       reverse(nums,0,n-k-1);
       reverse(nums,0,n-1);
     }
        
    }
}