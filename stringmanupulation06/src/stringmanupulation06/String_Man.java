package stringmanupulation06;

public class String_Man {

	public static void main(String[] args) {
		
		String s = "My favourite color is Blue";
		char[] mm=s.toCharArray();
		StringBuffer hh=new StringBuffer();
		for (int i=mm.length-1; i>=0; i--) {
			hh.append(mm[i]);
		}System.out.println(hh);

	}

}
