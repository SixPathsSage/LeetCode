class Solution {
    // https://leetcode.com/problems/is-subsequence/
    public boolean isSubsequence(String s, String t) {
        int i = 0;
        int j = 0;
        
        if(s.length() > t.length()) { return false; }
        
        char[] sarr = s.toCharArray();
        char[] tarr = t.toCharArray();
        
        while(i < sarr.length && j < tarr.length) {
            if(sarr[i] == tarr[j]) {
                i ++;
            }
            j ++;
        }
        
        return i == sarr.length;
    }
}