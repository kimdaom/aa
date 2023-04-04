import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int[] arr = new int [num];
		
		for(int i=0;i<arr.length;i++) {

			int x =sc.nextInt();
			int y =sc.nextInt();
			System.out.println(x+y);
			
		}
	}
}
