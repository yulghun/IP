package uy.yulghun;


/**
 * Binary search can be implemented with iterative function or recursive function. here we demonstrated both
 * 1. Compare key with the middle element
 * 2. If key matches with middle element, return the middle element index.
 * 3. Else if key is greater than the middle element, then key lies in right subarray after the middle element
 * 4. Else key is smaller recur for the left half
 * Binary search time complexity is O(Logn)
 * Space complexity is O(1)
 */
public class BinarySearch {

    static int[] arr;

    static {
        arr = new int[10];
    }

    public static void main(String[] args) {
        for (int i = 0; i < 6; i++) {
            arr[i] = i + 1;
        }
        int result = recursiveBinarySearch(1, 5, 3);
        System.out.println("Recursive function found at index: " + result);


        int result2 = iterativeBinarySearch(1, 5, 3);
        System.out.println("Iterative function found at index: " + result2);
    }

    private static int recursiveBinarySearch(int l, int r, int key) {
        if (r >= l) {

            int mid = (l + r) / 2;

            if (arr[mid] == key) {
                return mid;

            }
            if (arr[mid] > key) {
                return recursiveBinarySearch(l, mid - 1, key);
            }
            if (arr[mid] < key) {
                return recursiveBinarySearch(mid + 1, r, key);
            }
        }

        return -1;
    }

    private static int iterativeBinarySearch(int l, int r, int key) {
        while (r >= l) {
            int mid = (l + r) / 2;

            if (arr[mid] == key) {
                return mid;
            }
            if (arr[mid] > key) {
                r = mid - 1;
            } else if (arr[mid] < key) {
                l = mid + 1;
            }

        }

        return -1;
    }
}
