class Solution {
    public int findMaxLength(int[] nums) {
       HashMap<Integer,Integer>map=new HashMap<>();
       map.put(0,-1);
       int sum=0;
       int ans=0;
       int inx=0,len;
       for(int i=0;i<nums.length;i++)
       {
        if(nums[i]==0)
            sum+=-1;
        else if(nums[i]==1)
            sum+=1;
        if(map.containsKey(sum))
        {
          inx=map.get(sum);
          len=i-inx;
          if(len>ans)
          {
            ans=len;
          } 
          }
        else{
          map.put(sum,i);
          }
       }
       return ans;

    }
}