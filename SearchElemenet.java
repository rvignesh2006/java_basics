import java.util.Scanner;
public class SearchElemenet{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int n = sc.nextInt();
        System.out.println("Enter the elements of the array:");
        int arr[] = new int[n];
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter the elements to Search:");
        int key = sc.nextInt();
        int index = -1;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==key){
                index=i;
                break;
            }
        }
        if(index!=-1){
            System.out.println("Element found "+index);
        }
        else
        {
            System.out.println("Element not found");
        }
    
}
}
