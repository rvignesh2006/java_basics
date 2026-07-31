import java.util.*;
public class removezduplicates { 
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String word[] = s.split(" ");
        for(int i=0;i<word.length-1;i++){
            if(word[i]!=word[i+1]){
                word[i]=word[i+1];
                System.out.print(word[i]);
            }
        }
    }
    
}
