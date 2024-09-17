class Solution {
    public String kthDistinct(String[] arr, int k) {
        HashMap<String,Integer>str=new HashMap<>();
        for(String s:arr)
        str.put(s,str.getOrDefault(s,0)+1);
        int count=0;
       
         for(String s:arr)
         {
            if(str.get(s)==1)
            {
                count++;
                if(count==k)
                return s;
            }
         }

         return "";

        
    }
}