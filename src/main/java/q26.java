package home_work1111;

public class q26 {
public  static void q26(int num)
{
	if(num==0)
	{
		System.out.println(0);
	}
	if(num%10%2==0)
	{
		System.out.println(num%10);
	}
	q26(num/10);
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
