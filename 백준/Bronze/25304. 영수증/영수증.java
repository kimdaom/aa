import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int all = sc.nextInt();
		int num = sc.nextInt();
		
		for(int i =0;i<num;i++) {
			int price = sc.nextInt();
			int product = sc.nextInt();
			
			all = all-(price*product);			
		}
		if(all == 0) {
			System.out.println("Yes");
		}else {
			System.out.println("No");
		}
		
	}
}