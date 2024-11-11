package home_work1111;

public class q31 {
public static void q31(int []arr,int index)
{
	if(index==arr.length+1) {
		System.out.println("no more");
	}
	if(index%2==0)
	{
		System.out.println(arr[index]);
	}
	q31(arr,index+1);
	
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
