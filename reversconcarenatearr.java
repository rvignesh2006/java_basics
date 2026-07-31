import java.util.*;
public class reversconcarenatearr {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int ans[] = new int[2*n];
        for(int i=0;i<n;i++){
            ans[i] = arr[i];
            ans[i+n]=arr[n-1-i];
        }
        System.out.print("[");
        for(int i=0;i<ans.length;i++){
            System.out.print(ans[i]);
            if(i<ans.length-1){
                System.out.print(",");
            }
        }
        System.out.print("]");
    }
    
}
