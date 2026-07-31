package arrays;
import java.util.Scanner;
   class basic {
    public static void main(String args[]){
        Scanner sc  = new Scanner(System.in);
        System.out.println("Enter elements:");
        int arr[][] = new int[3][3];
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.println("Matrix is:");
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
    
}
