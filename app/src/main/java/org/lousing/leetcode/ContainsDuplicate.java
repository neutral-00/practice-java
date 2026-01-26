package org.lousing.leetcode;

/**
 * LeetCode Problem 217: Contains Duplicate
 * Given an integer array nums, return true if any value appears at least twice in the array,
 * and return false if every element is distinct.
 * Example 1:
 * Input: nums = [1,2,3,1]
 * Output: true
 * Example 2:
 * Input: nums = [1,2,3,4]
 * Output: false
 * Example 3:
 * Input: nums = [1,1,1,3,3,4,3,2,4,2]
 * Output: true
 */
public class ContainsDuplicate {

    public static boolean containsDuplicate(int[] nums) {
        var numSet = new java.util.HashSet<Integer>();
        for (int num : nums) {
            if (numSet.contains(num)) {
                return true;
            }
            numSet.add(num);
        }
        return false;
    }

    public static void showDemo() {
        int[] nums1 = {1, 2, 3, 1};
        System.out.println("Contains Duplicate: " + containsDuplicate(nums1)); // true

        int[] nums2 = {1, 2, 3, 4};
        System.out.println("Contains Duplicate: " + containsDuplicate(nums2)); // false

        int[] nums3 = {1, 1, 1, 3, 3, 4, 3, 2, 4, 2};
        System.out.println("Contains Duplicate: " + containsDuplicate(nums3)); // true
    }
}
