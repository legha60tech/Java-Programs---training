import java.util.*;
public class Program11 {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the array size :");
        int n = sc.nextInt();
        System.out.println("Enter the array elements :");
        int arr[] = new int[n];
        for(int i = 0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the value of k :");
        int k = sc.nextInt();
        int count = 0;
        for(int i = 0;i<n;i++){
            if(arr[i] == k){
                count++;
            }
        }
        System.out.println("the occurence of element k : "+count);
    }
}
