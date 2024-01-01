import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int v; // number of vehicles
		int w; // number of tyres
		v = sc.nextInt();
		w= sc.nextInt();
		float tw =( (v*4)-w)/2;
		if(v>=2 && w%2==0 && v<w){
		    System.out.println("total two wheelers: "+(int)tw);
		    System.out.println("total four wheelers: " + (int)(v-tw));
		    
		}
		else{
		    System.out.println("Invalid input");
		}
		
	}
}
