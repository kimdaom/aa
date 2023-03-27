import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int y = sc.nextInt();
		int[] x  = new int[num];
		
		for(int i = 0;i<x.length;i++) {
			x[i] = sc.nextInt();
		
			if(x[i]<y) {
			System.out.print(x[i]+" ");

			}
		}
	}
		
}