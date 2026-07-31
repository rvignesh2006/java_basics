import java.util.Scanner;
public class sort {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the elements:");
        for(int i=0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i < arr.length; i++) {
            for(int j=i+1;j<n-1;j++){
                if(arr[i]>arr[j]){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
            
        }
        System.out.println("Sorted Elements:");
        for(int i=0;i<n;i++)
            System.out.println(arr[i]+ " ");
    }
}
