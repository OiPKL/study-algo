import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int K = sc.nextInt();
		int cnt = 0;
		
		int[] bank = new int[N];
		
		for (int i = 0; i < N; i++) {
			bank[i] = sc.nextInt();
		}

		for (int i = N-1; i >= 0; i--) {
			int tmp = K / bank[i];
			K %= bank[i];
			cnt += tmp;
			if (K == 0) break;
		}
		System.out.println(cnt);
		
	}
}