import java.util.Scanner;
public class CaseConvert { 
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String:");
        String str = sc.nextLine();
        String lowerCaseStr = str.toLowerCase();
        String upperCaseStr = str.toUpperCase();
        System.out.println("Original String: " + str);
        System.out.println("Lower Case String: " + lowerCaseStr);
        System.out.println("Upper Case String: " + upperCaseStr);
    }   
}
