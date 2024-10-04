import java.util.HashMap;

class Solution {
    public int minSubarray(int[] nums, int p) {
        int sum = 0;
        int n = nums.length;
        for (int k : nums) {
            sum= (sum+k)%p;
        }

        
        int rem = sum;
        if (rem == 0) {
            return 0;  
        }

        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0, -1); 
        int curr = 0;
        int len = n;

        
        for (int i = 0; i < n; i++) {
            curr = (curr + nums[i]) % p;  
            int target = (curr - rem + p) % p; 
           
            if (map.containsKey(target)) {
                len = Math.min(len, i - map.get(target));
            }

           
            map.put(curr, i);
        }

        
        return (len == n) ? -1 : len;
    }
}
