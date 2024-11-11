package home_work1111;

public class q29 {
public static void q29(int num,int index,int numcopy)
{
	if (numcopy==index)
	{
		System.out.println(num);
	}
	num=num+index;
	System.out.println(num);
	q29( num, index+1,numcopy);
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
