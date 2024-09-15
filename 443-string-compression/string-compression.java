class Solution {
    public int compress(char[] chars) {
        if(chars.length==1)
        return 1;
       String s=chars[0]+"";
       int count=1;
        for(int i=1;i<chars.length;i++)
        {
            char curr=chars[i];
            char prev=chars[i-1];
            if(curr!=prev)
            {
                if(count>1)
                {
                s+=count;
                }
                s+=curr;
                count=1;
              
            }
            else
            {
                count++;
            }

        }
        if(count>1)
        {
           s+=count;
            count=1;
        }
    
        for(int i=0;i<s.length();i++)
        {
            chars[i]=s.charAt(i);
        }
        return (s.length());
    }
}