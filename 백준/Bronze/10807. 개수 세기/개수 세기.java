import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n,v;
		n=sc.nextInt();
		int arr[] = new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		v=sc.nextInt();
		int b=0;
		for(int i=0;i<arr.length;i++) {
			if(v==arr[i])
				b++;
		}
		System.out.println(b);
	}
}
