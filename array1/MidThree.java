public int[] midThree(int[] nums) {
  int midIndex = nums.length / 2; 
  return new int[] {nums[midIndex - 1], nums[midIndex], nums[midIndex + 1]};
}
