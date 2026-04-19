class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) return false;

        // Array to hold the frequency of 26 lowercase English letters
        int[] charCounts = new int[26];

        for (int i = 0; i < s.length(); i++) {
            // Increment for string s
            charCounts[s.charAt(i) - 'a']++; 
            // Decrement for string t
            charCounts[t.charAt(i) - 'a']--; 
        }

        // If they are anagrams, all counts should have balanced out to 0
        for (int count : charCounts) {
            if (count != 0) {
                return false;
            }
        }

        return true;
    }
}