package home_work1111;

public class q22 {
	public static String exe22(String word, int i ,String wordNew){
		if( i == word.length()) {
			return wordNew;
		}
		if(i%3 == 0 && i!= 0) {
			wordNew = wordNew + "*";
			
		}
		wordNew = wordNew + word.charAt(i);
		i+=1;
		return exe22(word, i, wordNew);
	}

	public static void main(String[] args) {
		String word = "liri";

	}

}
