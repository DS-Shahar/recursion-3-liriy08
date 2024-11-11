package home_work1111;

public class q42 {
public static int q42(int num)
{
	if(num<10)
	{
		return num;
	}
	
	int sum2=sum(num,0);
	num=sum2;
	 return q42(num);
}
public static int sum(int num,int sum1)
{	
	if(num/10==0)
	{
		return sum1;
	}
	
	sum1=sum1+num%10;
	return sum(num,sum1);
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
