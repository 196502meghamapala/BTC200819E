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
		
		String b1= "How";
		String b2= "Hwo";
		
		int s=b1.compareTo(b2);
		System.out.println(s);
		
		int b5[]= {2,6,8,10,15};
		
		for(int x: b5) {
			System.out.println(x);
		}
		
		
	

	}

}
