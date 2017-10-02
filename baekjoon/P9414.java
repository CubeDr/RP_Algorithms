import java.util.*;

public class P9414 {
    private final static int MAX_MONEY = 5000000;
    
    private static int priceAfter(int price, int year) {
	return 2*(int)Math.pow(price, year);
    }
    
    private static int calculate(int[] price, int priceLength, int limit) {
	int total = 0;
	for(int i=1; i<=priceLength; i++) {
	    total += priceAfter(price[priceLength-i], i);
	    if(total > limit) return -1;
	}
	return total;
    }
    
    public static void main(String[] args) {
	int T;
	int[] price = new int[40];
	int priceLength = 0;
	Scanner in = new Scanner(System.in);
	T = in.nextInt();

        while(T-- > 0) {
	    int t;
	    priceLength = 0;
	    while( (t = in.nextInt()) != 0)
		price[priceLength++] = t;
	    Arrays.sort(price, 0, priceLength);
	    t = calculate(price, priceLength, MAX_MONEY);
	    if(t != -1) System.out.println(t);
	    else System.out.println("Too expensive");
	}
    }
}
