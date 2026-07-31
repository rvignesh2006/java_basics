import java.util.*;
public class secondNonrepeatingchar {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
       boolean  found = false;
       for(int i=0;i<s.length();i++){
        if(s.indexOf(s.charAt(i))==s.lastIndexOf(s.charAt(i))){
            if(found){
                System.out.print(s.charAt(i));
                return ;
            }
            found =true;
        }
       }
        
    }
    
}
