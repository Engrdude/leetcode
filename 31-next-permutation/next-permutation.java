class Solution {

    public void nextPermutation(int[] nums) {
        int n = nums.length;
        int p1 = n-2;
       while(p1>=0 && nums[p1]>=nums[p1+1]){
          p1--; 
       }
        if(p1>=0){
            int p2 = n-1;
            while(p1<p2 && nums[p1]>=nums[p2]){
                p2--;
            }
           int temp = nums[p1];
           nums[p1] = nums[p2];
           nums[p2] = temp;
        }
       
        reverse(nums, p1 + 1, n - 1);

    }

    

    public static void reverse(int[] nums, int b, int d) {
        while (b < d) {
            int temp = nums[b];
            nums[b] = nums[d];
            nums[d] = temp;
            b++;
            d--;
        }
    }
}