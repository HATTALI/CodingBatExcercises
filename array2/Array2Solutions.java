public int countEvens(int[] nums) {
  int count = 0;
    for (int num : nums) {
        if (num % 2 == 0) {
            count++;
        }
    }
    return count;
}

////////////////////////////////

public int bigDiff(int[] nums) {
  int min = nums[0];
    int max = nums[0];
    for (int i = 1; i < nums.length; i++) {
        min = Math.min(min, nums[i]);
        max = Math.max(max, nums[i]);
    }
    return max - min;
}

///////////////////////////////

public int centeredAverage(int[] nums) {
    int min = nums[0];
    int max = nums[0];
    int sum = 0;

    for (int num : nums) {
        sum += num;
        min = Math.min(min, num);
        max = Math.max(max, num);
    }
    return (sum - min - max) / (nums.length - 2);

}
////////////////////////////

public int sum13(int[] nums) {
  int sum = 0;

    for (int i = 0; i < nums.length; i++) {
        if (nums[i] == 13) {
            i++;
        } else {
            sum += nums[i];
        }
    }
    return sum;
}

////////////////////////

public int sum67(int[] nums) {
    int sum = 0;
    boolean inBlock = false;
    for (int num : nums) {
        if (num == 6) {
            inBlock = true;
        } else if (inBlock && num == 7) {
            inBlock = false;
        } else if (!inBlock) {
            sum += num;
        }
    }
    return sum;
}

//////////////////////

public boolean has22(int[] nums) {
  for (int i = 0; i < nums.length - 1; i++) {
        if (nums[i] == 2 && nums[i + 1] == 2) {
            return true;
        }
    }
    return false;
}

//////////////////////

public boolean lucky13(int[] nums) {
  for (int num : nums) {
        if (num == 1 || num == 3) {
            return false;
        }
    }
    return true;
}

//////////////////////

public int[] post4(int[] nums) {
  int lastFourIndex = -1;
    for (int i = nums.length - 1; i >= 0; i--) {
            if (nums[i] == 4) {
                lastFourIndex = i;
                break;
            }
        }
        int newArrayLength = nums.length - lastFourIndex - 1;
        int[] result = new int[newArrayLength];
        for (int i = 0; i < newArrayLength; i++) {
            result[i] = nums[lastFourIndex + 1 + i];
        }
        return result;
}

///////////////////

public int[] notAlone(int[] nums, int val) {
        if (nums.length < 3) {
            return nums;
        }
        for (int i = 1; i < nums.length - 1; i++) {
            if (nums[i] == val && nums[i - 1] != val && nums[i + 1] != val) {
                nums[i] = Math.max(nums[i - 1], nums[i + 1]);
            }
        }
        return nums;
}

//////////////////

public int[] zeroFront(int[] nums) {
  if (nums == null || nums.length <= 1) {
            return nums;
        }

        int zeroPointer = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                int temp = nums[zeroPointer];
                nums[zeroPointer] = nums[i];
                nums[i] = temp;
                zeroPointer++;
            }
        }
        return nums;
}

//////////////////////

public int[] withoutTen(int[] nums) {
    int[] result = new int[nums.length];
    int index = 0;

    for (int num : nums) {
        if (num != 10) {
            result[index] = num;
            index++;
        }
    }
    return result;
}

/////////////////////

public int[] zeroMax(int[] nums) {
  for (int i = 0; i < nums.length; i++) {
        if (nums[i] == 0) {
            int maxOdd = 0;
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[j] % 2 == 1 && nums[j] > maxOdd) {
                    maxOdd = nums[j];
                }
            }
            if (maxOdd > 0) {
                nums[i] = maxOdd;
            }
        }
    }
    return nums;
}

////////////////////

public int[] evenOdd(int[] nums) {
  int[] result = new int[nums.length];
    int evenIndex = 0;
    int oddIndex = nums.length - 1;

    for (int num : nums) {
        if (num % 2 == 0) {
            result[evenIndex] = num;
            evenIndex++;
        } else {
            result[oddIndex] = num;
            oddIndex--;
        }
    }
    return result;
}

///////////////////

public String[] fizzBuzz(int start, int end) {
  String[] result = new String[end - start];

    for (int i = start; i < end; i++) {
        if (i % 3 == 0 && i % 5 == 0) {
            result[i - start] = "FizzBuzz";
        } else if (i % 3 == 0) {
            result[i - start] = "Fizz";
        } else if (i % 5 == 0) {
            result[i - start] = "Buzz";
        } else {
            result[i - start] = String.valueOf(i);
        }
    }

    return result;
}
