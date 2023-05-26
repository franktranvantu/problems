package com.franktran.problems;

import org.junit.Test;

import java.util.List;

public class RemoveElementTest {

  private List<RemoveElement> underTests = List.of(
      new Solution1()
  );

  @Test
  public void case1() {
    for (RemoveElement test : underTests) {
      int[] nums = {3,2,2,3};
      int val = 3;
      int[] expectedNums = {2, 2};
      assertTest(test, nums, val, expectedNums);
    }
  }

  @Test
  public void case2() {
    for (RemoveElement test : underTests) {
      int[] nums = {0,1,2,2,3,0,4,2};
      int val = 2;
      int[] expectedNums = {0,1,3,0,4};
      assertTest(test, nums, val, expectedNums);
    }
  }

  private void assertTest(RemoveElement test, int[] nums, int val, int[] expectedNums) {
      int k = test.solution(nums, val);
      assert k == expectedNums.length;
      for (int i = 0; i < k; i++) {
        assert nums[i] == expectedNums[i];
      }
  }
}