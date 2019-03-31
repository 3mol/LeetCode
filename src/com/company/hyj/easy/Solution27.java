package com.company.hyj.easy;

/**
 * Created by 胡宇靖 on 2019/3/31.
 */
public class Solution27 {
    /**
     * 给定 nums = [0,1,2,2,3,0,4,2], val = 2,
     * 函数应该返回新的长度 5, 并且 nums 中的前五个元素为 0, 1, 3, 0, 4。
     * 注意这五个元素可为任意顺序。
     * 你不需要考虑数组中超出新长度后面的元素。
     *
     * @param nums
     * @param val
     * @return
     */
    public int removeElement(int[] nums, int val) {
        int i = 0;
        // n 标识删除后的数组大小
        int n = nums.length;
        while (i < n) {
            // 当nums[i]==val时,把后方的元素移动到前面
            // 相当于把数组大小 减 1
            // 当然,如果后方元素放置在第i位的元素依旧为 val,将会在下一次while检测.
            if (nums[i] == val) {
                nums[i] = nums[n - 1];
                // 注意不能 i++
                n--;
            } else {
                i++;
            }
        }
        return n;
    }

    public static void main(String[] args) {
        Solution27 solution27 = new Solution27();
        int i = solution27.removeElement(new int[]{0, 1, 2, 2, 3, 0, 4, 2}, 2);
        System.out.println(i);
    }

}
