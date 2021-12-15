package stringmanupulation04;

public class StringMan {

	public static void main(String[] args) {
		
		String b = "Blue is my favourite color";
		String dd[]=b.split(" ");
		for (int i=0; i<dd.length; i++) {
			System.out.println(dd[i]);
		}
		
		char[] cc=b.toCharArray();
		StringBuffer jj= new StringBuffer();
		for (int i=cc.length-1; i>=0; i--) 
		{
			jj.append(cc[i]);
		}
		System.out.println(jj);
		
	

	}

}
