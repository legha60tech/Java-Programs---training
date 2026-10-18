import java.util.*;
public class Program9{
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the  array size : ");
        int n = sc.nextInt();
        int []arr = new int[n];
        System.out.println("Enter the  array elements : ");
        for(int i = 0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        int min = Integer.MAX_VALUE;
        int index = 0;
        for(int i = 0;i<n;i++){
            if(arr[i]<min){
                min = arr[i];
                index = i;
            }
        }
        System.out.println("Index of Minimum element is: "+index);
    }
}
