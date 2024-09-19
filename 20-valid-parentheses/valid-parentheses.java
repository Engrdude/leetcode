class Solution {
    public static boolean checkBracket(Stack<Character>st,char el)
    {
        if(st.size()==0)
            return false;
            else if(st.peek()!=el)
            return false;
            else
            st.pop();

            return true; 
    }
    public boolean isValid(String s) {

         Stack<Character>stk=new Stack<>();


    for(int i=0;i<s.length();i++)
    {
        char ch=s.charAt(i);
        if(ch=='('||ch=='{'||ch=='[')
        {
            stk.push(ch);        
        }
        else if(ch==')')
        { 
            boolean flag=checkBracket(stk,'(');
            if(flag==false)
            return flag;
        }
        else if(ch=='}'){
               boolean flag=checkBracket(stk,'{');
            if(flag==false)
               return flag;
        }
        else if(ch==']'){
             boolean flag= checkBracket(stk,'[');
            if(flag==false)
            return flag;
            
        }else{}

     }
       if(stk.size()==0)
       return true;
       else 
       return false;
    }
}