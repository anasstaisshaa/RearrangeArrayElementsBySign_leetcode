class Solution {
    public int[] rearrangeArray(int[] nums) {
        int[] rearranged = new int[nums.length];
        int positiveIndex = 0;
        int negativeIndex = 1;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > 0) {
                rearranged[positiveIndex] = nums[i];
                positiveIndex += 2;
            } else {
                rearranged[negativeIndex] = nums[i];
                negativeIndex += 2;
            }
        }

        return rearranged;
    }
}