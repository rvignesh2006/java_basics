import java.util.Scanner;
public class secondLargest {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the Array:");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the elements:");
        for(int i=0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }
        int large = arr[0];
        int secondLarge = arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i]>large){
                large = arr[i];
            }
        }
        for(int i=0;i<arr.length;i++){
            if(arr[i]>secondLarge && arr[i]!=large){
                secondLarge = arr[i];
            }
        }
        System.out.println("Second largest element is:"+secondLarge);
    }
    
}
