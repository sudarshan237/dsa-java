public class CountSubarraysSumK {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 1};
        int k = 5;

        int count = 0;

        for (int i = 0; i < arr.length; i++) {
            int sum = 0;
            for (int j = i; j < arr.length; j++) {
                sum += arr[j];
                if (sum == k) count++;
            }
        }

        System.out.println("Count = " + count);
    }
}
