import java.util.*;
class Main{
    public static void main(String args[]){
       Scanner sc = new Scanner(System.in);
       String val = sc.nextLine();
       System.out.print(sum(val));
    }
    public static String sum(String s){
        String [] s1 = s.split("[ ]");
        StringBuilder sb = new StringBuilder();
        for(String word : s1){
            StringBuilder temp = new StringBuilder(word);
            temp.reverse();
            sb.append(temp).append(" ");
        }
       while(sb.length()>0 && Character.isWhitespace(sb.charAt(sb.length()-1))){
           sb.deleteCharAt(sb.length()-1);
       }
        for(int i=0; i<sb.length();i++){
            char ch = sb.charAt(i);
            if(i%2==0)
            sb.setCharAt(i,Character.isAlphabetic(ch)? Character.toUpperCase(ch):'@');
            if(i%2!=0 && ch!=' ')
            sb.setCharAt(i,Character.isAlphabetic(ch)? Character.toLowerCase(ch):':');
            if(ch==' ')
            sb.setCharAt(i,(i%2==0)?'#':'*');
        }
        return sb.toString();
    }
}


// sample input: Coding. Ninjas @123
//output            : @gNiDoC*SaJnIn#:@:@