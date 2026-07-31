import java.util.*;
public class csubarray {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int count=0;
        for(int start = 0;start<n;start++){
            for(int end=start;end<n;end++){
                count++;
            }
        }
        System.out.println(count);
    }
    }
    