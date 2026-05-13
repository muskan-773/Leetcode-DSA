class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character> st = new HashSet<>();
        int max = 0,j = 0;
        for(int i = 0;i < s.length();i++){
            char ch = s.charAt(i);
            while(st.contains(ch)){
                st.remove(s.charAt(j));
                j++;
            }
            st.add(s.charAt(i));
            max = Math.max(max, i -j+1);
        }
        return max;
    }
}