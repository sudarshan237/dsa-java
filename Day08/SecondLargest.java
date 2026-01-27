public class SecondLargest {
    public static void main(String[] args) {
        int[] arr = {10, 5, 20, 8, 15};

        int largest = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;

        for (int x : arr) {
            if (x > largest) {
                second = largest;
                largest = x;
            } else if (x > second && x != largest) {
                second = x;
            }
        }

        System.out.println("Second largest = " + second);
    }
}
