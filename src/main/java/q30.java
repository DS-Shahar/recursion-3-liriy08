package home_work1111;

public class q30 {
	public static void q30(int num,int index,int numcopy)
	{
		if (numcopy==index)
		{
			System.out.println(num);
		}
		if (index%2==1)
		num=num+1;
		else {
			num=num+2;
		}
		System.out.println(num);
		q30( num, index+1,numcopy);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
