import java.util.*;
public class subbSString {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int count = 0;
        for(int start=0;start<s.length();start++){
            for(int end=start;end<s.length();end++){
                count++;
            }
        }
        System.out.println(count);
    }
    
}
