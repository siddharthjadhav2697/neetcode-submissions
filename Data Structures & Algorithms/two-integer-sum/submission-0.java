class Solution {
    public int[] twoSum(int[] nums, int target) {

        Map<Integer,Integer> map = new HashMap<>(nums.length);
        for(int i=0;i<nums.length;i++){
            int currentNum = nums[i];
            int secondNum = target - currentNum;

            if(map.containsKey(secondNum)){
                return new int[]{map.get(secondNum), i};
            }
            map.put(currentNum,i);
        }
        throw new IllegalArgumentException("Not found");
    }
}
