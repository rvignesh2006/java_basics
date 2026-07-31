import java.util.Scanner;
public class FindDuplicates {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Size of Array:");
        int n = sc.nextInt();
         int arr[] = new int[n];
        System.out.println("Enter the elements:");
        for(int i=0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Duplicate Elemets");
        for(int i=0;i<n;i++){
            for( int j=i+1;j<n;j++){
                if(arr[i]==arr[j]){
                    System.out.println(arr[i]+" ");
                    break;
                }
            }
        }
    }
}