public class RangeSumQuery {
    public static void main(String[] args) {
        int[] arr = {2, 4, 1, 3, 5};
        int[] prefix = new int[arr.length];

        prefix[0] = arr[0];
        for (int i = 1; i < arr.length; i++) {
            prefix[i] = prefix[i - 1] + arr[i];
        }

        int l = 1; // start index
        int r = 3; // end index

        int sum;
        if (l == 0) {
            sum = prefix[r];
        } else {
            sum = prefix[r] - prefix[l - 1];
        }

        System.out.println("Range sum = " + sum);
    }
}
