import java.util.*;
public class Program2{
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enetr the size of the array:");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enetr the array elements:");
        for(int i = 0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        for(int i =0;i<n;i++){
            if(i%2!=0){
                System.out.println(arr[i]+" ");
            }
        }
    }
}