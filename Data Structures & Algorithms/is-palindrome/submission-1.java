class Solution {
    public boolean isPalindrome(String s) {
        //trim and lowecase string and convert string to array
        //check if ascii value is in 97 and 122

        String s1 = s.trim().toLowerCase();
        StringBuilder result = new StringBuilder();
        for(char c : s1.toCharArray()){
            if((c >= 97 && c<= 122) || (c >=48 && c<=57)){
                result.append(c);
            }
        }

        int left=0;
        int right=result.length()-1;

        while(left<right){
            if(result.charAt(left) != result.charAt(right)){
                return false;
            }
            left++;
            right--;
        }
        return true;
        
    }
}
