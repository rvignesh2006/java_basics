public class stringdigit {
    public static void main(String args[]){
        int sum = 0;
        String s = "absh23hfj43jkn9";
        String word[] = s.split("\\D");
        for(int i=0;i<word.length;i++){
            if(word[i]!=""){
          sum+=Integer.parseInt(word[i]);
        }
    }
        System.out.println(sum);
    }
    
}
