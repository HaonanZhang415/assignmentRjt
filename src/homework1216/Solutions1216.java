package homework1216;

import java.util.*;

public class Solutions1216 {

    public int findMissingNumber(int[] numbers) {

        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < numbers.length; i++) {
            set.add(i);
        }
        for (int number : numbers) {
            if (set.contains(number)) {
                set.remove(number);
            }
        }

        return (Integer) set.toArray()[0];

    }

    static int pivotedBinarySearch(int arr[], int n, int key)
    {
        int pivot = findPivot(arr, 0, n - 1);


        if (pivot == -1)
            return binarySearch(arr, 0, n - 1, key);

        if (arr[pivot] == key)
            return pivot;
        if (arr[0] <= key)
            return binarySearch(arr, 0, pivot - 1, key);
        return binarySearch(arr, pivot + 1, n - 1, key);
    }

    static int findPivot(int arr[], int low, int high)
    {

        if (high < low)
            return -1;
        if (high == low)
            return low;

        int mid = (low + high) / 2;
        if (mid < high && arr[mid] > arr[mid + 1])
            return mid;
        if (mid > low && arr[mid] < arr[mid - 1])
            return (mid - 1);
        if (arr[low] >= arr[mid])
            return findPivot(arr, low, mid - 1);
        return findPivot(arr, mid + 1, high);
    }


    static int binarySearch(int arr[], int low, int high, int key)
    {
        if (high < low)
            return -1;


        int mid = (low + high) / 2;
        if (key == arr[mid])
            return mid;
        if (key > arr[mid])
            return binarySearch(arr, (mid + 1), high, key);
        return binarySearch(arr, low, (mid - 1), key);
    }

    public int secondLargestInArray(int[] numbers) {

        int maxValue = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;

        for (int number : numbers) {

            if (number > secondMax) {
                if (number > maxValue) {
                    secondMax = maxValue;
                    maxValue = number;
                }
                else {
                    secondMax = number;
                }

            }

        }
        return secondMax;

    }

    public Integer[] occurringOddNumberInArray(int[] numbers) {

        HashSet<Integer> set = new HashSet<>();

        for (Integer number : numbers) {
            if (set.contains(number)) {
                set.remove(number);
            }
            else {
                set.add(number);
            }

        }
        return (Integer[]) set.toArray();

    }

    public int minimumPlatform(double[] arrival, double[] departure) {

        class TimeAction {

            double time;
            int action;

            public TimeAction(double time, int action) {
                this.time = time;
                this.action = action;
            }
        }

        ArrayList<TimeAction> timeline = new ArrayList();

        for (double arr : arrival) {
            TimeAction ta = new TimeAction(arr, 1);
            timeline.add(ta);
        }

        for (double dep : departure) {
            TimeAction ta = new TimeAction(dep, -1);
            timeline.add(ta);
        }

        int result = 0;
        int maxPlatform = 0;
        timeline.sort(new Comparator<TimeAction>() {
            @Override
            public int compare(TimeAction o1, TimeAction o2) {
                return (int)o1.time - (int)o2.time;
            }
        });

        for (TimeAction ta : timeline) {
            System.out.println(Double.toString(ta.time) + ' ' + ta.action);
            result = result + ta.action;
            if (result > maxPlatform) {maxPlatform = result;}
        }

        return maxPlatform;

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

    public void pairSumClosetXInArray() {

    }

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

    public boolean searchMatrix(int[][] matrix, int target) {
        //corner case
        if(matrix == null || matrix.length == 0)return false;

        if(matrix[0] == null|| matrix[0].length == 0) return false;

        int r = matrix.length;
        int c = matrix[0].length;

        int cur_row = 0;
        int cur_col = c - 1;

        while(cur_row < r && cur_col >=0){

            if(matrix[cur_row][cur_col] == target){
                return true;
            }
            else if(matrix[cur_row][cur_col] < target){
                cur_row++;
            }
            else
                cur_col--;
        }
        return false;
    }

    public int stockBuy(int[] prices) {
        if (prices.length == 0) return 0;
        int min = prices[0];
        int maxProfit = Integer.MIN_VALUE;
        for(int i = 0; i < prices.length; i++) {
            if(prices[i] < min) {
                min = prices[i];
            }
            maxProfit = Math.max(maxProfit, prices[i] - min);
        }
        return maxProfit;
    }
    }


}
