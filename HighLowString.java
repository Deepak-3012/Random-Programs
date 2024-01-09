// TC : O(n)
// SC : O(n)

public class HighLow {
  public static String highAndLow(String numbers) {
    // Code here or
    String [] st = numbers.split("[ ]");
    Integer [] ans = new Integer[st.length];
    for(int i=0; i<st.length;i++){
      ans[i] = Integer.parseInt(st[i]);
    }
    int max = getMax(ans);
    int min = getMin(ans);
    return max + " " + min ;
  }
  public static int getMax(Integer ans[]){
    int max = ans[0];
    for(int x : ans){
      if(x>max){
        max = x;
      }
    }
    return max;
  }
  public static int getMin(Integer ans[]){
    int min = ans[0];
    for(int x : ans){
      if(x < min){
        min = x;
      }
    }
    return min;
  }
}