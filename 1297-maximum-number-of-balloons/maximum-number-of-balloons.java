class Solution {
    public int maxNumberOfBalloons(String text) {
        int[] freq = new int[26];

        for(int i = 0;i < text.length();i++){
            char ch = text.charAt(i);
            freq[ch - 'a']++;
        }
        int a = freq[0];   
        int b = freq[1];   
        int l = freq[11];  
        int n = freq[13]; 
        int o = freq[14];  

        l = l / 2;
        o = o / 2;

        return Math.min(
                Math.min(a, b),
                Math.min(Math.min(l, o), n)
        );
    }
}