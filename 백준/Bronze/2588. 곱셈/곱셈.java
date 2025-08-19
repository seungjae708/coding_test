import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int A,B,C,D,E;
		A = scanner.nextInt();
		B = scanner.nextInt();
		
		C=A*(B%10);
		System.out.println(A*(B%10));
		D=A*((B%100)/10);
		System.out.println(A*((B%100)/10));
		E=A*((B%1000)/100);
		System.out.println(A*((B%1000)/100));
		System.out.println(C+D*10+E*100);
	}
}
