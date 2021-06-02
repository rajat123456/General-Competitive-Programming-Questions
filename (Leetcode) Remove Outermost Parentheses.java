// Problem: https://leetcode.com/problems/remove-outermost-parentheses/

/*
 Time Complexity: O(n^2)-> Since every time we are adding character to end of out resultant string, so in worst case it takes quadratic
 Space Complexity: O(n)-. approx equal to n 
*/

class Solution {
    public String removeOuterParentheses(String s) {
        
        int start=0;
        int end=0;
        int count=0;
        String ans="";
        
        for(int q=0;q<s.length();q++)
        {
            if(s.charAt(q)=='(')
            {
                if(count!=0)
                    ans+=s.charAt(q);
                
                ++count;
            }
            
            
            else if(s.charAt(q)==')')
            {
                --count;
                if(count>0)
                    ans+=s.charAt(q);
                    
            }
                
        }
        
        return ans;
        
    }
}
