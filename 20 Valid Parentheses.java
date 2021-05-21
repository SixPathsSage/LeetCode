// https://leetcode.com/problems/valid-parentheses/
class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        Map<Character, Character> map  = getBrackets();
        for(char c: s.toCharArray()) {
            if(map.containsKey(c)) {
                stack.push(c);
            }
            else if(stack.empty() == false && map.get(stack.peek()) == c) {
                stack.pop();
            } else {
                return false;
            }
        }
        
        return stack.empty();
    }
    
    private Map<Character, Character> getBrackets() {
        Map<Character, Character> brackets = new HashMap<>();
        
        brackets.put('(', ')');
        brackets.put('{', '}');
        brackets.put('[', ']');
        
        return brackets;
    }
}