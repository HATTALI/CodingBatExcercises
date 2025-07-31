public int[] frontPiece(int[] nums) {
  if (nums.length < 2) {
        return java.util.Arrays.copyOf(nums, nums.length); 
    } else {
        return new int[]{nums[0], nums[1]};}
}