public int maxTriple(int[] nums) {
  int first = nums[0];
        int last = nums[nums.length - 1];
        int middle = nums[nums.length / 2];
        int maxOfFirstAndMiddle = Math.max(first, middle);
        return Math.max(maxOfFirstAndMiddle, last);

}
