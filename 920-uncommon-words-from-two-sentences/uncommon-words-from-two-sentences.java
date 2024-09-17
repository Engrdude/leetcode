class Solution {
    public String[] uncommonFromSentences(String s1, String s2) {
        HashSet<String>word=new HashSet<>();
        String p1[]=s1.split(" ");
        String p2[]=s2.split(" ");
        HashMap<String,Integer>map=new HashMap<>();
        ArrayList<String>list=new ArrayList<>();
        for(int i=0;i<p1.length;i++)
        {
          list.add(p1[i]);
            if(map.containsKey(p1[i]))
            {
                map.put(p1[i],map.get(p1[i])+1);
            }
            else
            map.put(p1[i],1);
        }
        for(int i=0;i<p2.length;i++)
        {
            list.add(p2[i]);
            if(map.containsKey(p2[i]))
            {
                map.put(p2[i],map.get(p2[i])+1);
            }
            else
            map.put(p2[i],1);
        }
        ArrayList<String>uniqueList=new ArrayList<>();
        for(int i=0;i<list.size();i++)
        {
            if(map.get(list.get(i))==1)
            uniqueList.add(list.get(i));

        }
        String []ans=new String[uniqueList.size()];
        for(int i=0;i<ans.length;i++)
        {
            ans[i]=uniqueList.get(i);
        }
        return ans;
        
    }
}