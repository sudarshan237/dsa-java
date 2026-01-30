import java.util.HashMap;

public class LongestSubarraySumK {
    public static void main(String[] args) {
        int[] arr = {1, 2, -2, 4, -4, 6};
        int k = 6;

        HashMap<Integer, Integer> map = new HashMap<>();
        int prefixSum = 0;
        int maxLen = 0;

        for (int i = 0; i < arr.length; i++) {
            prefixSum += arr[i];

            if (prefixSum == k) {
                maxLen = i + 1;
            }

            if (map.containsKey(prefixSum - k)) {
                maxLen = Math.max(maxLen, i - map.get(prefixSum - k));
            }

            map.putIfAbsent(prefixSum, i);
        }

        System.out.println("Max length = " + maxLen);
    }
}
