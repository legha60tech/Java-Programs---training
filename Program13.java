
import java.util.*;
public class Program13 {
    public static int maxSum(int arr[], int k) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i <= arr.length - k; i++) {
            int sum = 0;
            for (int j = i; j < i + k; j++) {
                sum += arr[j];
            }
            if (sum > max) {
                max = sum;
            }
        }
        return max;
    }

    public static int minSum(int arr[], int k) {
        int min = Integer.MAX_VALUE;
        for (int i = 0; i <= arr.length - k; i++) {
            int sum = 0;
            for (int j = i; j < i + k; j++) {
                sum += arr[j];
            }
            if (sum < min) {
                min = sum;
            }
        }

        return min;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array size:");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter k:");
        int k = sc.nextInt();
        if (k <= 0 || k > n) {
            System.out.println("Invalid k value");
        } else {
            System.out.println("Maximum sum: " + maxSum(arr, k));
            System.out.println("Minimum sum: " + minSum(arr, k));
        }
    }
}
