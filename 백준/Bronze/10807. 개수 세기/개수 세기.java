import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int[] arr  = new int[num];
		int num2 = 0;
		
		for(int i = 0;i<arr.length;i++) {
			arr[i] = sc.nextInt();
			}
		int v = sc.nextInt();
		for(int j=0;j<arr.length;j++)
		
			if(arr[j]==v) {
				num2++;
		}

		System.out.println(num2);
	}
}