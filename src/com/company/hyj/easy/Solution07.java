package com.company.hyj.easy;

/**
 * Created by 胡宇靖 on 2019/3/27.
 */
public class Solution07 {
    // 给出一个 32 位的有符号整数，你需要将这个整数中每位上的数字进行反转。

    // 执行用时 : 52 ms, 在Reverse Integer的Java提交中击败了17.04% 的用户
    // 内存消耗 : 48.5 MB, 在Reverse Integer的Java提交中击败了0.95% 的用户
    public int reverse(int x) {
        /**
         * 特点:
         * 没有什么特别的吧
         * 1. 先把是否为负标识一次
         * 2. 取绝对值
         * 3. 每一位反向加入新的String中
         * 4. 转为int
         */

        String s = String.valueOf(Math.abs(x));
        StringBuilder stringBuilder = new StringBuilder();
        if (x < 0) stringBuilder.append('-');
        for (int i = s.length() - 1; i >= 0; i--) {
            stringBuilder.append(s.charAt(i));
        }
        try {
            return Integer.parseInt(stringBuilder.toString());
        } catch (NumberFormatException e) {
            return 0;
        }
    }

    public int reverse(int x, int b) {
        /**
         * 特点:
         * 使用取位法 #Mark
         */
        return 0;
    }

    public static void main(String[] args) {
        int reverse = new Solution07().reverse(1534236469);
        System.out.println(reverse);
    }
}
