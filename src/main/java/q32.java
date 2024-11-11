package home_work1111;

public class q32 {
	public static void q32(int []arr,int index)
	{
		if(index==arr.length-1) {
			System.out.println("no more");
		}
		if(arr[index]<arr[index+1])
		{
			System.out.println(arr[index]);
		}
		q32(arr,index+1);
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
