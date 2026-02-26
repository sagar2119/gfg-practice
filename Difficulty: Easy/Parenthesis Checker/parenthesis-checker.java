class Solution {
    public boolean isBalanced(String s) {
        // code here
        Stack<Character> stack = new Stack<>();
        for(char c:s.toCharArray()){
            if(c=='('||c=='{'||c=='['){
                stack.push(c);
            }else if(stack.isEmpty()) 
            {
                return false;
                
            }else if((c ==')'&& stack.pop()!= '('||
            c=='}'&& stack.pop() !='{'||
            c==']'&& stack.pop() !='[')){
                     return false; 
                    }
                }
                return stack.isEmpty();
            }
    }
