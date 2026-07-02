class Solution {
    public boolean isHappy(int n) {
        HashSet<Integer> st = new HashSet<>();
        while (n != 1) {
            if (st.contains(n))
                return false;
            st.add(n);
            int ans = 0;
            while (n > 0) {
                int rem = n % 10;
                ans += rem * rem;
                n /= 10;
            }
            n = ans;
        }
        return true;

    }
}