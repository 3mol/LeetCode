package easy;

/**
 * Created by 胡宇靖 on 2019/3/28.
 */
public class Solution09 {
    // 判断一个整数是否是回文数。回文数是指正序（从左向右）和倒序（从右向左）读都是一样的整数。
// 示例 1:
// 输入: 121
// 输出: true
// 示例 2:
//
// 输入: -121
// 输出: false
// 解释: 从左向右读, 为 -121 。 从右向左读, 为 121- 。因此它不是一个回文数。
// 示例 3:
//
// 输入: 10
// 输出: false
// 解释: 从右向左读, 为 01 。因此它不是一个回文数。

    // 执行用时 : 166 ms, 在Palindrome Number的Java提交中击败了71.53% 的用户
    // 内存消耗 : 41.5 MB, 在Palindrome Number的Java提交中击败了63.67% 的用户
    public boolean isPalindrome(int x) {
        /**
         * 取出每一位放入数组中
         * 取数组的第一位和最后一位做比较;取第二位和倒数第二位作比较...
         * 负数都不是回文数
         */
        // 1234;
        if (x < 0) {
            return false;
        }
        int[] arr = new int[10];
        int head = 0;
        while (true) {
            int i = x % 10;
            arr[head++] = i;
            x = x / 10;
            if (x == 0) break;
        }
        // head 是数组的长度,需要减一才是有效的元素下标
        for (int i = 0; i < (head) / 2; i++) {
            if (arr[i] != arr[head - 1 - i]) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        boolean palindrome = new Solution09().isPalindrome(212);
        System.out.println(palindrome);
    }
}
