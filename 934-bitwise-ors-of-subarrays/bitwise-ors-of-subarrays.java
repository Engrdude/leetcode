class Solution {
    public int subarrayBitwiseORs(int[] arr) {

        HashSet<Integer>result=new HashSet<>();
        HashSet<Integer>prev=new HashSet<>();
        for(int i=0;i<arr.length;i++)
        {
           HashSet<Integer>current=new HashSet<>();
           current.add(arr[i]);
           result.add(arr[i]);
           for(int prevOr:prev)
           {
            current.add(prevOr|arr[i]);
            result.add(prevOr|arr[i]);
           }
           prev=current;
           
        }
        return result.size();
        
    }
}