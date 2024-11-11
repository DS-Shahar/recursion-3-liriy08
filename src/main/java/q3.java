package home_work1111;

public class q3 {
public static int q3(int []arr,int num, int count, int index)
{
	if(index==-1)
	{
		return count;
	}
	
	if(num==arr[index])
	{
		count++;
	}
	return q3(arr,num,count,index-1);
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			 int count=0;
	}

}
