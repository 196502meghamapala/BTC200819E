package strinmanupulation07;

public class String_Man_IndexOf {

	public static void main(String[] args) {
		
		String ff = "I love my work please come to me z";

		int bb=ff.indexOf("z");
		System.out.println(bb);
		
		char[] gg=ff.toCharArray();
		StringBuffer hh=new StringBuffer();
		for (int i=gg.length-1; i>=0; i--)
		{
			hh.append(gg[i]);
		}
		System.out.println(hh);


	}

}
