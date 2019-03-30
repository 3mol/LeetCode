package com.company.hyj.easy;

/**
 * Created by 胡宇靖 on 2019/3/28.
 */
public class Solution13 {

    // 执行用时 : 108 ms, 在Roman to Integer的Java提交中击败了46.60% 的用户
    // 内存消耗 : 64.7 MB, 在Roman to Integer的Java提交中击败了0.95% 的用户
    public int romanToInt(String s) {
        /**
         * 有点冗长啊...
         */
        int result = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == 'M') {
                result += 1000;
            } else if (c == 'D') {
                result += 500;
            } else if (c == 'C') {
                try {
                    char c1 = s.charAt(i + 1);
                    if (c1 == 'D') {
                        result += 400;
                        i++;
                    } else if (c1 == 'M') {
                        result += 900;
                        i++;
                    } else result += 100;
                } catch (Exception e) {
                    result += 100;
                }
            } else if (c == 'L') {
                result += 50;
            } else if (c == 'X') {
                try {
                    char c1 = s.charAt(i + 1);
                    if (c1 == 'L') {
                        result += 40;
                        i++;
                    } else if (c1 == 'C') {
                        result += 90;
                        i++;
                    } else result += 10;
                } catch (Exception e) {
                    result += 10;
                }
            } else if (c == 'V') {
                result += 5;
            } else if (c == 'I') {
                try {
                    char c1 = s.charAt(i + 1);
                    if (c1 == 'V') {
                        result += 4;
                        i++;
                    }else if (c1 == 'X') {
                        result += 9;
                        i++;
                    } else result += 1;
                } catch (Exception e) {
                    result += 1;
                }

            }
        }
        return result;
    }

    public static void main(String[] args) {
        Solution13 solution13 = new Solution13();
        System.out.println(solution13.romanToInt("MCMXCIV"));
        System.out.println(solution13.romanToInt("LVIII"));
        System.out.println(solution13.romanToInt("IX"));
        System.out.println(solution13.romanToInt("IV"));
        System.out.println(solution13.romanToInt("III"));
    }
}
