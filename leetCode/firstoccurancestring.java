//Given two strings needle and haystack, return the index of the first occurrence of needle in haystack,
//  or -1 if needle is not part of haystack.
import java.util.Scanner;

public class firstoccurancestring {
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    String s1 = sc.nextLine();
    String s2 = sc.nextLine();
    for(int i=0;i<=s1.length()-s2.length();i++){
        if(s1.substring(i,i+s2.length()).equals(s2)){
            System.out.println("index:"+i);
        }
       
    }
    
  }  
    
}
