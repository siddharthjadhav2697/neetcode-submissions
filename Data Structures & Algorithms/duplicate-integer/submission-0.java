class Solution {
    public boolean hasDuplicate(int[] nums) {
        int[] copy = Arrays.copyOf(nums, nums.length);
        long a = Arrays.stream(copy).distinct().count();
        return nums.length != a;
    }
}