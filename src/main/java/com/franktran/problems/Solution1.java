package com.franktran.problems;

import java.util.LinkedHashSet;
import java.util.Set;

// O(?)
public class Solution1 implements Solution {

  @Override
  public int lengthOfLongestSubstring(String s) {
    int complex = 0;
    int output = 0;
    for (int i = 0; i < s.length(); i++) {
      Set<Character> set = new LinkedHashSet<>();
      StringBuilder longest = new StringBuilder();
      for (int j = i; j < s.length(); j++) {
        boolean added = set.add(s.charAt(j));
        complex++;
        if (added) {
          longest.append(s.charAt(j));
        } else {
          break;
        }
      }
      if (output < longest.length()) {
        output = longest.length();
      }
    }
    System.out.println(complex);
    return output;
  }
}
