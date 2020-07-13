package com.company.hyj.easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Solution350 {
  // https://assets.leetcode-cn.com/solution-static/350/350_fig1.gif
  public static void main(String[] args) {
    int[] ints1 = {1, 2, 2, 1};
    int[] ints2 = {2, 2};
    int[] intersect = new Solution350().intersect(ints1, ints2);
    for (int i : intersect) {
      System.out.print(i + "\t");
    }
  }

  public int[] intersect(int[] nums1, int[] nums2) {
    // 保证 num1 是最短的数组
    if (nums1.length > nums2.length) {
      return intersect(nums2, nums1);
    }
    Map<Integer, Integer> map = new HashMap<>();
    for (int i : nums1) {
      Integer counter = map.get(i);
      if (null == counter) {
        map.put(i, 1);
      } else {
        map.put(i, counter + 1);
      }
    }
    int[] results = new int[nums1.length];
    int index = 0;
    for (int j : nums2) {
      Integer counter = map.get(j);
      if (null == counter) {
        continue;
      }
      if (counter > 0) {
        results[index++] = j;
        map.put(j, counter - 1);
      }
    }
    int[] ints = Arrays.copyOfRange(results, 0, index);
    return ints;
  }
}
