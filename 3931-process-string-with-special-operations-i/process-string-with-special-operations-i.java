class Solution {
    public String processStr(String s) {
        StringBuilder res = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (ch == '%') {
                res.reverse();
            } else if (ch == '#') {
                res.append(res.toString());
            } else if (ch == '*') {
                if (!res.isEmpty()) {
                    res.deleteCharAt(res.length() - 1);
                }
            } else if (ch >= 'a' && ch <= 'z') {
                res.append(ch);
            }
        }
        return res.toString();
    }
}