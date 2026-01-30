import java.util.HashMap;

public class SubarraySumK {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, -2, 5};
        int k = 5;

        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0, 1);

        int prefixSum = 0;
        int count = 0;

        for (int x : arr) {
            prefixSum += x;

            if (map.containsKey(prefixSum - k)) {
                count += map.get(prefixSum - k);
            }

            map.put(prefixSum, map.getOrDefault(prefixSum, 0) + 1);
        }

        System.out.println("Count = " + count);
    }
}
