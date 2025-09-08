import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n,A,B;
		n=sc.nextInt();
		for(int i=0;i<n;i++) {
			A=sc.nextInt();
			B=sc.nextInt();
			System.out.println(A+B);
		}
	}
}
