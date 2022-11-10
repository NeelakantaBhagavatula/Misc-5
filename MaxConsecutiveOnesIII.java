// Time Complexity : O(n) where n = length of nums array
// Space Complexity : O(1)
// Did this code successfully run on Leetcode :
// Any problem you faced while coding this :

// Your code here along with comments explaining your approach

//1004. Max Consecutive Ones III (Medium) - https://leetcode.com/problems/max-consecutive-ones-iii/
// Time Complexity : O(2n) where n = length of nums array
// Space Complexity : O(1)
//class Solution {
//	public int longestOnes(int[] nums, int k) {
//		if (nums == null || nums.length == 0)
//			return 0;
//
//		int start = 0, max = 0;
//
//		for (int i = 0; i < nums.length; i++) { // O(n)
//			if (nums[i] == 0)
//				k--;
//
//			if (k < 0) {
//				while (start <= i && nums[start] == 1) { // O(n)
//					start++;
//				}
//				start++;
//				k++;
//			}
//			max = Math.max(max, i - start + 1);
//		}
//
//		return max;
//	}
//}

// Time Complexity : O(n) where n = length of nums array
// Space Complexity : O(1)
class Solution {
	public int longestOnes(int[] nums, int k) {
		if (nums == null || nums.length == 0)
			return 0;

		int start = 0;

		for (int i = 0; i < nums.length; i++) { // O(n)
			if (nums[i] == 0)
				k--;

			if (k < 0) {
				if (nums[start] == 0) {
					k++;
				}
				start++;
			}
		}

		return nums.length - start;
	}
}