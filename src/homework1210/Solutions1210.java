package homework1210;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Solutions1210 {

    public ArrayList<int[]> findAllPairs(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap();
        ArrayList<int[]> result = new ArrayList();

        for(int i = 0; i < nums.length; i++)
            map.put(nums[i], i);

        for(int i = 0; i < nums.length; i++)
            if(map.containsKey(target - nums[i]) && i != map.get(target - nums[i]))
                result.add(new int[] {i, map.get(target - nums[i])});

        return result;
    }

    public int findFirstRepeat(int[] nums) {
        Map<Integer, Integer> map = new HashMap();
        for(int i = 0; i < nums.length; i++) {
            if(map.containsKey(nums)) return map.get(nums);
            map.put(nums[i], i);
        }
        return -1;
    }

    public int[] findClosetToZero(int[] nums) {
        int minDiff = Integer.MAX_VALUE;
        int[] result = new int[] {-1, -1};
        for(int i = 0; i < nums.length; i++) {
            for(int j = i; j < nums.length; j++) {
                if (Math.abs(nums[i] + nums[j]) < minDiff) {
                    result = new int[] {i, j};
                    minDiff = Math.abs(nums[i] + nums[j]);
                }
            }
        }
        return result;
    }

    public int findMaxDifference(int[] nums) {
        int maxDiff = Integer.MIN_VALUE;
        int minIndex = 0;

        for(int i = 1; i < nums.length; i++) {

            if (nums[i] < nums[i - 1]) {
                minIndex = i;
            }

            if (nums[i] > nums[minIndex]) {
                if (nums[i] - nums[minIndex] > maxDiff) {
                    maxDiff = nums[i] - nums[minIndex];
                }
            }
        }
        return maxDiff;
    }

    public static void main(String[] args) {

    }

}
