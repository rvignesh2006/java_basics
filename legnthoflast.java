import java.util.*;
public class legnthoflast {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        s=s.trim();
        String[] word = s.split(" ");
        System.out.println(word[word.length-1].length());

    }
    
}
