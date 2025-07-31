public int[] rotateLeft3(int[] nums) {
  int[] rotatedArray = new int[3];
        rotatedArray[0] = nums[1];
        rotatedArray[1] = nums[2];
        rotatedArray[2] = nums[0];
        return rotatedArray;
}