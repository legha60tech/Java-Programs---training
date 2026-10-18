import java.util.*;
public class Program14 {
    static int[] product(int[] arr) {
        int n = arr.length;
        int prod = 1;
        int[] res = new int[n];
        for (int i = 0; i < n; i++) {
            prod = prod * arr[i];
        }
        for (int i = 0; i < n; i++) {
            res[i] = prod / arr[i];
        }

        return res;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int[] res = product(arr);
        for (int i = 0; i < n; i++) {
            System.out.print(res[i] + " ");
        }
    }
}
