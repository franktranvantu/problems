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
      String haystack = "sadbutsad", needle = "sad";
      int index = test.strStr(haystack, needle);
      assert index == 0;
    }
  }

  @Test
  public void case2() {
    for (Solution test : underTests) {
      String haystack = "leetcode", needle = "leeto";
      int index = test.strStr(haystack, needle);
      assert index == -1;
    }
  }

  @Test
  public void case3() {
    for (Solution test : underTests) {
      String haystack = "a", needle = "a";
      int index = test.strStr(haystack, needle);
      assert index == 0;
    }
  }
}