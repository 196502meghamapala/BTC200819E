package strinmanupulation07;

public class StringMan {

	public static void main(String[] args) {
		
		String pp = "I love my work please come to me";
		char[] kk=pp.toCharArray();
		StringBuffer jj = new StringBuffer();
		for (int i = kk.length-1; i>=0; i--) {
			jj.append(kk[i]);
		}System.out.println(jj);

	}

}
