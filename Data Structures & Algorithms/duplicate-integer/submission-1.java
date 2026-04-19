class Solution {
    public boolean hasDuplicate(int[] nums) {
        long a = Arrays.stream(nums).distinct().count();
        return nums.length != a;
    }
}