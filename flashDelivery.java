import java.util.*;
public class flashDelivery {
    public static void main(String args[]){
        Scanner sc  =  new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
            int min = arr[0];
            int count = 1;
            for(int j=1;j<n;j++){
                if(arr[j]<min){
                    count++;
                    min = arr[j];
                     System.out.print(min);
                }
        }
       
    }
    
}
