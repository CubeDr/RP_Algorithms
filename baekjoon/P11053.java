import java.util.*;

public class P11053 {
    static int[] arr;
    static int[] mem;

    private static int count(int idx) {
	if(mem[idx] != 0) return mem[idx];
	int max = 0, count;
	for(int i=idx+1; i<arr.length; i++) {
	    if(arr[i] <= arr[idx]) continue;
	    count = count(i);
	    if(count > max) max = count;
	}
	return mem[idx] = max + 1;
    }
    
    public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
	int N = in.nextInt();
	arr = new int[N];
	for(int i=0; i<N; i++)
	    arr[i] = in.nextInt();
	in.close();

        mem = new int[N];

	int max = 0, count;
	for(int i=0; i<N; i++) {
	    count = count(i);
	    if(max < count)
		max = count;
	}

	System.out.println(max);
    }
}
