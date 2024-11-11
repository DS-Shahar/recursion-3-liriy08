package home_work1111;

public class q28 {
public static void q28(int n, int a1, int d, int index, int num)
{
	if(index==n) {
		System.out.println(num);
	}
	num=a1+d;
	System.out.println(num);
	q28(n, a1, d,index+1,num);
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
