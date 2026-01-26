package org.lousing.leetcode;

/**
 * Problem 219: Contains Duplicate II
 * Given an integer array nums and an integer k, return true if there are two distinct indices i and j in the array
 * such that nums[i] == nums[j] and abs(i - j) <= k.
 * Example 1:
 * Input: nums = [1,2,3,1], k = 3
 * Output: true
 * Example 2:
 * Input: nums = [1,0,1,1], k = 1
 * Output: true
 * Example 3:
 * Input: nums = [1,2,3,1,2,3], k = 2
 * Output: false
 */
public class ContainsDuplicateV2 {

    public static void showDemo() {
        var nums = new int[]{1, 2, 3, 1, 2, 3};
        System.out.println(containsNearbyDuplicate(nums, 2)); // false

        var num2 = new int[] {1,2,3,1};
        System.out.println(containsNearbyDuplicate(num2, 3)); // true

    }

    public static boolean containsNearbyDuplicate(int[] numbers, int k) {
        var numSet = new java.util.HashSet<Integer>();
        for (int i = 0; i < numbers.length; i++) {
            int n = numbers[i];
            if(numSet.contains(n)) {
                return  true;
            }
            numSet.add(n);
            if(numSet.size() > k){
                numSet.remove(numbers[i-k]);
            }
        }
        return  false;
    }
}
