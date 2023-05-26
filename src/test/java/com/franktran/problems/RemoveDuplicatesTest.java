package com.franktran.problems;

import org.junit.Test;

import java.util.List;

public class RemoveDuplicatesTest {

  private List<RemoveDuplicates> underTests = List.of(
      new Solution1(),
      new Solution2(),
      new Solution3()
  );

  @Test
  public void case1() {
    for (RemoveDuplicates test : underTests) {
      int[] nums = {1, 1, 2};
      int[] expectedNums = {1, 2};
      assertTest(test, nums, expectedNums);
    }
  }

  @Test
  public void case2() {
    for (RemoveDuplicates test : underTests) {
      int[] nums = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
      int[] expectedNums = {0, 1, 2, 3, 4};
      assertTest(test, nums, expectedNums);
    }
  }

  private void assertTest(RemoveDuplicates test, int[] nums, int[] expectedNums) {
      int k = test.solution(nums);
      assert k == expectedNums.length;
      for (int i = 0; i < k; i++) {
        assert nums[i] == expectedNums[i];
      }
  }
}