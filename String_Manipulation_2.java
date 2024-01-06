import java.util.*;
class Main{
public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    String a = sc.nextLine();
    String b = sc.nextLine();
    String c = sc.nextLine();
    String moda = stringMani(a,true);
    String modb = stringMani(b,false);
    String modc = c.toUpperCase();
    String comb = moda + modb + modc;
    System.out.print(comb);
}
public static String stringMani(String inp , boolean val){
   StringBuilder sb = new StringBuilder();
   for(char x : inp.toCharArray()){
        if(isvowel(x) && val)
        sb.append('%');
        else if(!isvowel(x) && !val )
        sb.append('#');
        else
        sb.append(x);
        
    }
    return sb.toString();
}
private static boolean isvowel(char c){
    return "AEIOUaeiou".indexOf(c)!=-1;
}
}

// sample input: how are you
// output: h%wa#eYOU    

// TC O(n)
// SC O(n) 