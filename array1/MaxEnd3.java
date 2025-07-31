public int[] maxEnd3(int[] nums) {
  int firstElement = nums[0];
        int lastElement = nums[2];
        int maxValue = Math.max(firstElement, lastElement);
        int[] result = new int[3];
        result[0] = maxValue;
        result[1] = maxValue;
        result[2] = maxValue;
        return result;

}
