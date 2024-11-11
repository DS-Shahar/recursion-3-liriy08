package home_work1111;

public class q24 {

	public static void q24(char n, char a) {
		if(n==a) {
			System.out.println(a);
		}
		if(n!=a) {
			System.out.println(n);
			q24((char)(n+1),a);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	}

}
