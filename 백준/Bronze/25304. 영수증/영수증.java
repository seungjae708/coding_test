import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n,a,b,sum1,sum2;
		sum2=0;
		sum1=sc.nextInt();
		n=sc.nextInt();
		for(int i=0;i<n;i++) {
			a=sc.nextInt();
			b=sc.nextInt();
			sum2+=a*b;
		}
		if(sum1==sum2)
			System.out.println("Yes");
		else
			System.out.println("No");
	}
}
