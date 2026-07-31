import java.util.*;
public class samestringcount {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String s = "doluboludoluboludolu";
        String target = "bolu";
        System.out.println((s.length()-s.replace("dolu","").length())/target.length());
    }
    
}
