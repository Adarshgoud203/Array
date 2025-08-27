package Strings;

public class Stringconstloop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	String str="Satya Arjun";
	String restr=" ";
	System.out.println("Original string: "+str);
	for(int i=0;i<str.length();i++) {
		restr=str.charAt(i)+restr;
	}
	System.out.println("Reversed String: "+ restr);
	}
}

