import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n,a,b;
		n=sc.nextInt();
		for(int i=0;i<n;i++) {
			int sum=0;
			a=sc.nextInt();
			b=sc.nextInt();
			sum=a+b;
			System.out.println("Case #"+(i+1)+": "+a+" + "+b+" = "+sum);
		}
	}
}
