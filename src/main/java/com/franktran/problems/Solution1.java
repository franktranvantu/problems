package com.franktran.problems;

public class Solution1 implements RemoveDuplicates {
  @Override
  public int solution(int[] nums) {
    int[] temp = new int[nums.length];
    int k = 0;
    for (int i = 0; i < nums.length-1; i++) {
      if (nums[i] != nums[i+1]) {
        temp[k++] = nums[i];
      }
    }
    temp[k++] = nums[nums.length-1];
    for (int i = 0; i < k; i++) {
      nums[i] = temp[i];
    }
    return k;
  }
}
