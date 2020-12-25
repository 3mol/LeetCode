package easy;

/**
 * Created by 胡宇靖 on 2019/3/29.
 */
public class Solution14 {
    public String longestCommonPrefix(String[] strs) {
        /**
         * 最长串是最短字符串
         * 循环最短串的长度即可
         * 1. 找最短串(也可以不找,若超出下标就跳出循环
         */
        StringBuffer sb = new StringBuffer();
        int length = strs[0].length();

        Character currentChar = null;
        here: for (int j = 0; j < strs.length; j++) {
            for (int i = 0; i < length; i++) {
                if (currentChar == null) {
                    currentChar = strs[j].charAt(i);
                }else {
                    if (currentChar==strs[j].charAt(i)){
                        sb.append(strs[j].charAt(i));
                    }else break here;
                }
            }
        }
        return "";
    }

    public static void main(String[] args) {

    }
}
