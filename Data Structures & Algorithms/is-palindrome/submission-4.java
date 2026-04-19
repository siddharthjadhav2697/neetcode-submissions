class Solution {
    public boolean isPalindrome(String s) {
        StringBuilder st = new StringBuilder();
        for(char c : s.toLowerCase().toCharArray()){
            if((c >= 'a' && c<='z') || (c >= 'A' && c<='Z') || (c >= '0' && c<='9')){
                st.append(c);
            }
        }


        int left=0;
        int right=st.length()-1;
        while(left<right){
            if(st.toString().charAt(left) != st.toString().charAt(right)){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
