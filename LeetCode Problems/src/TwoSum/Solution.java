package TwoSum;

import java.util.HashMap;
import java.util.Map;

class Solution {

    public int[] twoSum(int[] nums, int target) {
        int[] res = new int[2];
        HashMap<Integer, Integer> sol = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (sol.containsKey(target - nums[i])) {
                res[0] = sol.get(target - nums[i]);
                res[1] = i;
                return res;
            }
            sol.put(nums[i], i);


        }
        return res;

    }

}