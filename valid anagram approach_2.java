// TC - O(n)
// SC - O(n)
class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!= t.length())
        return false;
        HashMap<Character, Integer> hm = new HashMap<>();
        // map the frequency
        for(char x: s.toCharArray()){
            hm.put(x,hm.getOrDefault(x,0)+1);
        }
        // decrease the frequency
        for(char x : t.toCharArray()){
            hm.put(x,hm.getOrDefault(x,0)-1);
        }
        for(int val : hm.values() ){
            if(val!=0)
            return false;
        }
        return true;
    }
}