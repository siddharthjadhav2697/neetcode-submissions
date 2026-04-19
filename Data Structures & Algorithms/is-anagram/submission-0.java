class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()) return false;
        char[] sArr = s.toCharArray();
        char[] tArr = t.toCharArray();
        Arrays.sort(sArr);
        Arrays.sort(tArr);
        String sc = Arrays.toString(sArr);
        String tc = Arrays.toString(tArr);

        return sc.equals(tc);
    }
}
