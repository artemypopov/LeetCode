package com.leetcode.problem.easy.twosum;

import java.util.HashMap;

public class TwoSum {
    public static void main(String[] args) {
        TwoSum twoSum = new TwoSum();

        int[] nums = {2, 7, 11, 15};
        int target = 9;
        int[] result = twoSum.twoSum(nums, target);
        System.out.println("[" + result[0] + "," + result[1] + "]");

    }
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i=0; i<nums.length; i++) {
            if (map.containsKey(target-nums[i])) {
                return new int[] {i, map.get(target-nums[i])};
            }
            map.put(nums[i], i);
        }
        return new int[] {};
    }
}