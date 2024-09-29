import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
	
	static int N, M;
	static int[] NN;
	static List<Integer> arr;
	static boolean[] visited;
	
    public static void main(String[] args) {

    	Scanner sc = new Scanner(System.in);
    	
    	N = sc.nextInt();
    	M = sc.nextInt();
    	
    	NN = new int[N];
    	for (int i = 0; i < N; i++)
    		NN[i] = sc.nextInt();
    	Arrays.sort(NN);
    		
    	arr = new ArrayList<>();
    	visited = new boolean[N+1];
    	    	
    	btk(0);
    }
    
    static void btk(int idx) {
    	
    	if (arr.size() == M) {
    		for (int num : arr)
    			System.out.print(num + " ");
    		System.out.println();
    		return;
    	}
    	
    	for (int i = idx; i < N; i++) {
    		
    		if (!visited[i]) {
    			visited[i] = true;
    			arr.add(NN[i]);
    			btk(i + 1);
    			arr.remove(arr.size() - 1);
    			visited[i] = false;
    		}
    	}
    	
    }
}