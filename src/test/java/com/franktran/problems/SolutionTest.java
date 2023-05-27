package com.franktran.problems;

import org.junit.Test;

import java.util.List;

public class SolutionTest {

  private List<Solution> underTests = List.of(
      new Solution1()
  );

  @Test
  public void case1() {
    for (Solution test : underTests) {
      String s = "abcdefgh";
      int output = test.lengthOfLongestSubstring(s);
      assert output == 8;
    }
  }

  @Test
  public void case2() {
    for (Solution test : underTests) {
      String s = "bbbbb";
      int output = test.lengthOfLongestSubstring(s);
      assert output == 1;
    }
  }

  @Test
  public void case3() {
    for (Solution test : underTests) {
      String s = "pwwkew";
      int output = test.lengthOfLongestSubstring(s);
      assert output == 3;
    }
  }
}