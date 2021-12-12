package string_man;

public class StringMan {

	public static void main(String[] args) {
		
		String b = "How are you bunny";
		String s[]=b.split(" ");
		for (int i=0;  i<s.length; i++) {
			System.out.println(s[i]);
		}
		
		int mm=b.indexOf("r");
		System.out.println(mm);
		
		String uu=b.substring(2, 10);
		System.out.println(uu);
		
		char[] cc=b.toCharArray();
		StringBuffer ss=new StringBuffer();
		for (int i=cc.length-1; i>=0; i--) 
		{
			ss.append(cc[i]);
		}
		System.out.println(ss);
}
	
}