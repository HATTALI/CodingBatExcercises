public boolean unlucky1(int[] nums) {
  int len = nums.length;
        if (len < 2) {
            return false;
        }
        if ((nums[0] == 1 && nums[1] == 3)) {
            return true;
        }
        if (len >= 3 && (nums[1] == 1 && nums[2] == 3)) {
            return true;
        }
        if (len >= 3 && (nums[len - 2] == 1 && nums[len - 1] == 3)) {
            return true;
        }
        if (len >= 4 && (nums[len - 3] == 1 && nums[len - 2] == 3)) {
            return true;
        }
        return false;
}