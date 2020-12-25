package easy;

import java.util.HashMap;

/**
 * Created by 胡宇靖 on 2019/3/27.
 */
public class Solution01 {
    // 执行用时 : 65 ms, 在Two Sum的Java提交中击败了20.04% 的用户
    // 内存消耗 : 37.8 MB, 在Two Sum的Java提交中击败了0.99% 的用户
    /*
    * 暴力模拟
    * */
    public int[] twoSum(int[] nums, int target) {
        int[] arr = new int[2];
        for (int i = 0; i < nums.length; i++) {
            int target2 = target - nums[i];
            for (int j = 0; j < nums.length; j++) {
                if (nums[j] == target2 && j != i) {
                    arr[0] = i;
                    arr[1] = j;
                    return arr;
                }
            }
        }
        throw new IllegalArgumentException("No Solution01.");
    }

    // 执行用时 : 11 ms, 在Two Sum的Java提交中击败了73.97% 的用户
    // 内存消耗 : 39.9 MB, 在Two Sum的Java提交中击败了0.99% 的用户
    /*
    * 利用 HashMap 查找速度快的特点,查询是否存在键为 target-num 的键值对
    * hashMap的结构是 <目标,下标>
    * 缺点是空间复杂度大
    * */
    public int[] twoSum(int[] nums, int target, int args) {
        HashMap<Integer, Integer> hashMap = new HashMap<>(5);
        for (int i = 0; i < nums.length; i++) {
            hashMap.put(nums[i], i);
        }
        for (int i = 0; i < nums.length; i++) {
            int target2 = target - nums[i];
            if (hashMap.containsKey(target2) && hashMap.get(target2) != i) {
                return new int[]{i, hashMap.get(target2)};
            }
        }
        throw new IllegalArgumentException("No Solution01.");
    }

    public static void main(String[] args) {
        Solution01 solution = new Solution01();
        int[] arr = {3, 2, 4};
        int[] ints = solution.twoSum(arr, 6, 1);
        for (int anInt : ints) {
            System.out.println(anInt);
        }
    }
}
