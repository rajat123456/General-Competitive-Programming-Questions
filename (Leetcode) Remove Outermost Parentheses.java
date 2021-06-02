// Problem: https://leetcode.com/problems/remove-outermost-parentheses/

class Solution {
    public String removeOuterParentheses(String s) {
        
        
        int start=0;
        int end=0;
        int count=0;
        StringBuilder sb=new StringBuilder();
        
        for(int q=0;q<s.length();q++)
        {
            if(s.charAt(q)=='(')
            {
                if(count!=0)
                    sb.append(s.charAt(q));
                
                ++count;
            }
            
            
            else if(s.charAt(q)==')')
            {
                --count;
                if(count>0)
                    sb.append(s.charAt(q));
                    
            }
                
        }
        
        return sb.toString();
        
    }
}
