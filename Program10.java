import java.util.*;
public class Program10{
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the array size : ");
        int n = sc.nextInt();
        int []arr = new int[n];
        System.out.println("Enter the array elements : ");
        for(int i = 0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        int index = 0;
        int max = Integer.MIN_VALUE;
        for(int i = 0;i<n;i++){
            if(arr[i]>max){
                max = arr[i];
                index = i;
            }
        }
        System.out.println("Index of Maximum element is: "+index);
    }
}
