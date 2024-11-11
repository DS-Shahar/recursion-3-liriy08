package home_work1111;

public class q25 {
	public static void q25(int n, int i) {
		if(i==1) {
			System.out.println(1);
			return;
		}
		if(n%i==0) {
			System.out.println(i);
		}
		q25(n, i-1);
	}
 
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
