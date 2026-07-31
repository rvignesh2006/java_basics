import java.util.Scanner;
class minNum{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the numbers:");
        arr[0] = sc.nextInt();
        int min = arr[0];
        for(int i=1;i<arr.length;i++){
            arr[i] = sc.nextInt();
            if(arr[i]<min){
                min= arr[i];
            }
            
        }
        System.out.println(min);
    }
}