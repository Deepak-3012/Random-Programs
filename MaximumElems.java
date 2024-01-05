// MAXIMUM ELEMENT( AN ELEMENT IS A MAXIMUM ELEMENT, IF THE ELEMENT IS GREATER THAN THE ELEMENTS ON ITS RIGHT)
/*TC - O(n)
SC - O(n)*/

import java.util.*;
public class MaximumElems {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> List = new ArrayList<>();
        List.add(7);
        List.add(60);
        List.add(3);
        List.add(44);
        List.add(7);
        List.add(3);
        ArrayList<Integer> ans = maxElem(List);
        System.out.print(ans);

    }
    public static ArrayList<Integer> maxElem(ArrayList<Integer> list){
        ArrayList<Integer> lst = new ArrayList<>();
        int maximum = list.get(list.size()-1);
        lst.add(maximum);
        for(int i=list.size()-2; i>=0; i--){
            if(maximum<list.get(i)){
                lst.add(list.get(i));
                maximum = list.get(i);
            }
        }
        Collections.reverse(lst);
        return lst;
    }
}
