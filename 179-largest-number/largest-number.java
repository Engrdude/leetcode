import java.util.Arrays;

class Solution {
    public String largestNumber(int[] nums) {
        // Convert each number to a string
        String[] strNums = new String[nums.length];
        for (int i = 0; i < nums.length; i++) {
            strNums[i] = String.valueOf(nums[i]);
        }
        
        // Sort strings using custom comparator
        Arrays.sort(strNums, (a, b) -> (b + a).compareTo(a + b));
        
        // If the largest number is "0", return "0"
        if (strNums[0].equals("0")) {
            return "0";
        }
        
        // Build the result from sorted array
        StringBuilder result = new StringBuilder();
        for (String num : strNums) {
            result.append(num);
        }
        
        return result.toString();
    }
}
