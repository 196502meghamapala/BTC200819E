package string_man;

public class StringMan {

	public static void main(String[] args) {
		
		String b = "How are you";
		String s[]=b.split(" ");
		for (int i=0;  i<s.length; i++) {
			System.out.println(s[i]);
		}
		
		int d=b.indexOf("H");
		System.out.println(d);
		
		String k=b.substring(2,6);
		System.out.println(k);
		
        char[] ff= b.toCharArray();
		StringBuffer mm=new StringBuffer();
		for(int i=ff.length-1;i>=0;i--)
		{
			mm.append(ff[i]);
		}
		System.out.println(mm);
		
	}

}
