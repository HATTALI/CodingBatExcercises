public boolean sameFirstLast(int[] nums) {
    if (nums.length >= 1) {
    return nums[0] == nums[nums.length - 1];
  }
  return false;
}
