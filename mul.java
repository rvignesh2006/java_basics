public class mul {
    public static void main(String args[]){
        int n = 679;
        while(n>9){
            int pos = 1;
            while(n>0){
                int digit = n%10;
                pos=pos*digit;
                n/=10;
            }
            n=pos;
        }
        System.out.println(n);
        
    }
    
}
