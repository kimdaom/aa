import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int test = sc.nextInt();
		
		for(int i=1;i<=test;i++) {
			int num = sc.nextInt();
			int num2 = sc.nextInt();

			System.out.println("Case #"+i+": "+(num+num2));
			
		}
		
	}
}