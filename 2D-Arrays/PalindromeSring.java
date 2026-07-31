public class PalindromeSring {
    public static void main(String[] args) {
        String s="plaindrome";
        s=s.toLowerCase();
        int left=0;
        int right=s.length()-1;
        while(left<=right)
        {
            char le=s.charAt(left);
            char re=s.charAt(right);
            if(!Character.isLetterOrDigit(le))
            {
                left++;
            }
            else if(!Character.isLetterOrDigit(re))
            {
                right--;
            }
            else
            {
                if(le!=re)
                {
                  System.out.println("False");
                  return;
                }
                left++;
                right--;
            }
        }
        System.out.println("True");
    }
}