class Solution {
public:
    bool isAnagram(string s, string t) {

        if (s.length() != t.length()) {
            return false;
        }

        unordered_map<char, int> mp;

        // Store frequency of characters in s
        for (int i = 0; i < s.length(); i++) {
            char ch1 = s[i];
            mp[ch1]++;
        }

        // Reduce frequency using t
        for (int i = 0; i < t.length(); i++) {
            char ch2 = t[i];

            if (mp.find(ch2) == mp.end())
                return false;

            if (mp[ch2] == 0)
                return false;

            mp[ch2]--;
        }

        return true;
    }
};