import java.util.*;
class clibingStairs{
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        int n = sc.nextInt();
        if(n==1){
            System.out.println(n);
            return;
        }
        if(n==2){
            System.out.println(n);
            return;
        }
        int f = 1;
        int s = 2;
        for(int i=3;i<=n;i++){
            int third = f+s;
            f=s;
            s=third;
            
        }
        System.out.println(s);
    }
}