package com.franktran.problems;

public class Solution1 implements RemoveElement {
  @Override
  public int solution(int[] nums, int val) {
    int k = 0;
    for (int i = 0; i < nums.length; i++) {
      if (nums[i] != val) {
        nums[k++] = nums[i];
      }
    }
    return k;
  }
}
