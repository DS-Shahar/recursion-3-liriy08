package home_work1111;

public class q21 {
	public static int q21(String word, int index)
	{
		if(index==-1)
		{
			return 0;
		}
		if (Character.isLowerCase(word.charAt(index)))
		{
			return q21(word,index-1)+1;
			
		}
		return q21(word,index-1);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String word="Liri";
 int index= word.length();
	}

}
