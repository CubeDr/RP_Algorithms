import java.util.Scanner;

public class P2896 {
    public static void main(String[] args) {
	double A, B, C;
	double I, J, K;

	Scanner in = new Scanner(System.in);
	A = in.nextInt();
	B = in.nextInt();
	C = in.nextInt();
	I = in.nextInt();
	J = in.nextInt();
	K = in.nextInt();
	in.close();

	double min = A/I;
	if(min > B/J) min = B/J;
	if(min > C/K) min = C/K;

	A -= min*I;
	B -= min*J;
	C -= min*K;

	System.out.println(A + " " + B + " " + C);
    }
}
