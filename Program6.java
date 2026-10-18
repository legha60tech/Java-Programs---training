import java.util.*;
public class Program6{
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enetr the array size");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enetr the array elements");
        for(int i = 0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        int prod = 1;
        for(int i = 0;i<n;i++){
            prod *= arr[i];
        }
        System.out.println("Product is: "+prod);
    }
}
