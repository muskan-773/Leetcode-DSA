class Solution {
    public String mapWordWeights(String[] words, int[] weights) {
        StringBuilder result = new StringBuilder();

        for (String word : words) {
            int total = 0;
            for (char ch : word.toCharArray()) {
                total += weights[ch - 'a'];
            }
            int r = total % 26;
            char mappedChar = (char) ('z' - r);
            result.append(mappedChar);
        }
        return result.toString();
    }
}