import java.util.Scanner;
public class RightRotateArray {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Array size:");
        int n = sc.nextInt();
        System.out.println("Enter the elements:");
        int arr[] = new int[n];
        for(int i=0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }  
        System.out.println("Enter the value for k:"); 
        int k = sc.nextInt();
        k=k%n;
        reverse(arr,0,n-1);
        reverse(arr,0,k-1);
        reverse(arr,k,n-1);
        System.out.println("Rotated array is:");
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]+" ");
        } 
    }
    public static void reverse(int[] arr, int start, int end){
        while(start<end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
    }
    


