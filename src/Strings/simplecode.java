package Strings;

public class simplecode {

	public static void main(String[] args) {
		int count=1;
		String word="Hello good morning";
		for(int i=1;i<word.length();i++) {
			if(word.charAt(i)==' ') {
				count++;
			}
		}
		System.out.println("The number is string is:"+count);
	}

}
