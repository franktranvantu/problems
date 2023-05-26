package com.franktran.problems;

public class Solution3 implements RemoveDuplicates {
  @Override
  public int solution(int[] nums) {
    int i = 0;
    for (int j = 1; j < nums.length; j++) {
      if (nums[i] != nums[j]) {
        nums[++i] = nums[j];
      }
    }
    return i+1;
  }
}
