public class PairSum {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 6, 8};
        int target = 10;

        int i = 0, j = arr.length - 1;
        boolean found = false;

        while (i < j) {
            int sum = arr[i] + arr[j];

            if (sum == target) {
                System.out.println("Pair found: " + arr[i] + " + " + arr[j] + " = " + target);
                found = true;
                break;
            } else if (sum < target) {
                i++;
            } else {
                j--;
            }
        }

        if (!found) {
            System.out.println("No pair found");
        }
    }
}
