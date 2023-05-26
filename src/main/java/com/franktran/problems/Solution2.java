package com.franktran.problems;

public class Solution2 implements RemoveDuplicates {
  @Override
  public int solution(int[] nums) {
    int k = 0;
    for (int i = 0; i < nums.length-1; i++) {
      if (nums[i] != nums[i+1]) {
        nums[k++] = nums[i];
      }
    }
    nums[k++] = nums[nums.length-1];
    return k;
  }
}
