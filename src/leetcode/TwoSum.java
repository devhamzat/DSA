package leetcode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

//    Two Sum
//    Easy
//    Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
//    You may assume that each input would have exactly one solution, and you may not use the same element twice.
//    You can return the answer in any order.
//            Example 1:
//
//    Input: nums = [2,7,11,15], target = 9
//    Output: [0,1]
//    Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
//    Example 2:
//    Input: nums = [3,2,4], target = 6
//    Output: [1,2]
//    Example 3:
//    Input: nums = [3,3], target = 6
//    Output: [0,1]
//    Constraints:
//            2 <= nums.length <= 104
//            -109 <= nums[i] <= 109
//            -109 <= target <= 109
//    Only one valid answer exists.
//            Follow-up: Can you come up with an algorithm that is less than O(n2) time complexity?
public class TwoSum {
    /*
     * first thought: the main objective basically is to we want to return the index of two numbers such that their sum equates two a given target.
     * APPROACH1: Loop through the array with one value in memeory and then adding the following values to check iif target is met,
     *            if target is not met we keeping looping through, what this means is that they are two loops in play here,
     *            one loop to hold the value, and another one to check addition to target
     * Approach2: use a hashmap:
     * Loop through the array once.
•   For each number, compute complement = target - nums[i].
•
Check if that complement is already in the hash map.
•
If it is, return the stored index and the current index.
•
If it is not, store the current number with its index in the map and continue.
     * */

    public int[] approachOneOfTwoSum(int[] nums, int target) {
//Approach 1:
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[]{i, j};
                }
            }
        }
        return nums;
    }

    public int[] approachTwoOfTwoSum(int[] nums, int target) {
//Approach 2:
        int[] result = new int[2];
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (map.containsKey(complement)) {
                result[1] = map.get(complement);
                result[0] = i;
                return result;
            }
            map.put(nums[i], i);

        }
        return result;
    }

    public static void main(String[] args) {
        int[] arr = {2, 7, 11, 15};
        int target = 9;
        TwoSum obj = new TwoSum();
        int[] res = obj.approachOneOfTwoSum(arr, target);
        System.out.println("res: " + Arrays.toString(res));
        int[] arr2 = {3, 7, 4, 2};
        int target2 = 9;
        TwoSum obj2 = new TwoSum();
        int[] res2 = obj2.approachTwoOfTwoSum(arr2, target2);
        System.out.println("res2: " + Arrays.toString(res2));
    }

}
