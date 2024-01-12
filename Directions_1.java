// Direction based problem
// TC - O(n)
// SC - O(1)
import java.util.*;
public class Main
{
	public static void main(String[] args) {
    Scanner  sc = new Scanner(System.in);
    int n  = sc.nextInt();
    int x = 0; int y = 0; 
    int distance = 10;
    char c = 'R';
    while(n>0){
        switch(c){
            case 'R':
            x = x + distance;
            distance+=10;
            c = 'U';
            break;
            
            case 'U':
                y = y+distance;
                distance+=10;
                c = 'L';
                break;
            case 'L':
                x -= distance;
                distance+=10;
                c = 'D';
                break;
            case 'D':
                y-=distance;
                distance += 10;
                c = 'A';
                break;
            case 'A':
                x += distance;
                distance += 10;
                c = 'R';
                break;
        }
        n--;
    }
    System.out.println(x + " "+ y);
	}
}

// Sample input: 3
// output : -20 20
