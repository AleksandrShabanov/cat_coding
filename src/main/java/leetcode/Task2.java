package leetcode;

import java.util.Arrays;

/**
 * Given an array of integers nums and an integer target, return indices of the two
 * numbers such that they add up to target.
 *
 * You may assume that each input would have exactly one solution, and you may not use the same element twice.
 *
 * You can return the answer in any order.
 */

public class Task2 {
    public int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                if (nums[i] + nums[j] == target && i != j) {
                    result[0] = i;
                    result[1] = j;
                    return result;
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Task2 task2 = new Task2();
        int[] array = {1, 2, 5, 10};
        System.out.println(Arrays.toString(task2.twoSum(array, 3)));
    }
}
