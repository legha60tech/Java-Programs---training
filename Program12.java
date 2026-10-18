import java.util.*;
public class Program12 {
    public static int kindex(int arr[],int k){
        for(int i = 0;i<arr.length;i++){
            if(arr[i]==k)
                return i;
        }
        return -1;
    }
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the array size : ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("enter the array elements : ");
        for(int i = 0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the value of k : ");
        int k = sc.nextInt();
        int res = kindex(arr, k);
        System.out.println("the index of element k is "+res);
    }
    
}
