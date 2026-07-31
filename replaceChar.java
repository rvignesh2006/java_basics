import java.util.Scanner;
public class replaceChar {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the character:");
        String str = sc.nextLine();
        System.out.println("Enter the character to replace:");
        char oldChar = sc.next().charAt(0);
        System.out.println("Enter the new character:");
        char newChar = sc.next().charAt(0);
        String result = "";
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)==oldChar){
                result+=newChar;
            }
            else{
                result+=str.charAt(i);
            }
        }
        System.out.println("After replace:"+result);
    }
    
}
