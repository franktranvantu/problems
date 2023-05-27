package com.franktran.problems;

// O(haystack.length() * needle.length())
public class Solution1 implements Solution {
  @Override
  public int strStr(String haystack, String needle) {
    if (haystack.length() < needle.length()) {
      return -1;
    }

    for (int i = 0; i <= haystack.length() - needle.length(); i++) {
      int counter = 0;
      for (int j = 0; j < needle.length(); j++) {
        if (haystack.charAt(i+j) == needle.charAt(j)) {
          counter++;
        } else {
          break;
        }
      }
      if (counter == needle.length()) {
        return i;
      }
    }
    return -1;
  }
}
