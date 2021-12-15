package stringmanupulation01;

public class StringMan {

	public static void main(String[] args) {
		
		String s = "Welcom to HelloWorld By Java";
		char[] s1=s.toCharArray();
		StringBuffer jj=new StringBuffer();
		for (int i=s.length()-1; i>=0; i--)
		    {
			jj.append(s1[i]);
			}
		System.out.println(jj);

	}

}
