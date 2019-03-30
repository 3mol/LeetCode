package com.company.hyj.medium;

import java.util.ArrayList;
import java.util.List;


/**
 * Created by 胡宇靖 on 2019/3/30.
 */
public class Solution46 {
    public List<List<Integer>> permute(int[] nums) {
        /**
         * 数组的全排列
         */
        ArrayList<List<Integer>> arrayList = new ArrayList<>();
        if (nums == null || nums.length == 0) {
            return arrayList;
        }
        prem(nums, 0, nums.length - 1, arrayList);
        return arrayList;
    }

    private void prem(int[] nums, int start, int end, ArrayList<List<Integer>> arrayList) {
        // 递归终止条件是只有一个数字的时候,那一个数字做全排列
        if (start == end) {
            List<Integer> list = new ArrayList<>();
            for (int i = 0; i <= end; i++) {
                list.add(nums[i]);
            }
            arrayList.add(list);
        }
        for (int i = start; i <= end; i++) {
            // 交换数组
            swap(nums, start, i);
            prem(nums, start + 1, end, arrayList);
            // 还原数组为下一组全排列做准备
            swap(nums, start, i);
        }
    }

    private void swap(int[] A, int i, int j) {
        int temp = A[i];
        A[i] = A[j];
        A[j] = temp;
    }

    public static void main(String[] args) {
        Solution46 solution46 = new Solution46();
        int[] ints = {1, 2, 3};
        List<List<Integer>> permute = solution46.permute(ints);
        System.out.println(permute.toString());
    }
}
