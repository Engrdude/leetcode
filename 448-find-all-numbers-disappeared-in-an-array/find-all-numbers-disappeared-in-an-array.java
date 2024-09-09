class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        HashMap<Integer,Integer>map=new HashMap<>();
        ArrayList<Integer>list=new ArrayList<>();
        for(int i=0;i<nums.length;i++)
        {
            map.put(nums[i],1);
        }
        for(int i=1;i<=nums.length;i++)
        {
            if(map.get(i)==null)
            list.add(i);
        }

        return list;
        
    }
}