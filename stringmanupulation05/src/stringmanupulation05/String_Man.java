package stringmanupulation05;

public class String_Man {

	public static void main(String[] args) {
		
		String b = "Blue is my favourite color";
		String dd[]=b.split(" ");
		for (int i=0; i<dd.length; i++) {
			System.out.println(dd[i]);
		}

	}

}
