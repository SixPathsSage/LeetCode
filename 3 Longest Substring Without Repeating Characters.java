// https://leetcode.com/problems/longest-substring-without-repeating-characters/
// https://www.youtube.com/watch?v=4i6-9IzQHwo
class Solution {
    public int lengthOfLongestSubstring(String s) {
        char[] text = s.toCharArray();
        Set<Character> set = new HashSet<>();
        
        int i = 0; 
        int j = 0;
        int length = 0;
        while(j <= i && i < text.length) {
            if(set.contains(text[i])) {
                set.remove(text[j]);
                j ++;
            } else {
                set.add(text[i]);
                length = Math.max(length, i-j+1);
                i ++;
            }
        }
        
        return length;
    }
}