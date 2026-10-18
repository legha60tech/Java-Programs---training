import java.util.*;
public class Program5 {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enetr the array size");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enetr the array elements");
        for(int i = 0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        int sum = 0;
        for(int i = 0;i<n;i++){
            sum += arr[i];
        }
        System.out.println("Sum is: "+sum);
    }
}
