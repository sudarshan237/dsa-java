import java.util.HashMap;

public class FirstNonRepeating {
    public static void main(String[] args) {
        int[] arr = {4, 5, 4, 6, 5, 7};

        HashMap<Integer, Integer> map = new HashMap<>();
        for (int x : arr) {
            map.put(x, map.getOrDefault(x, 0) + 1);
        }

        for (int x : arr) {
            if (map.get(x) == 1) {
                System.out.println("First non-repeating = " + x);
                break;
            }
        }
    }
}
