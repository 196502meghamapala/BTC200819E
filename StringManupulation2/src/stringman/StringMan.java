package stringman;

public class StringMan {

	public static void main(String[] args) {
		
		String s = "How are you good day W";
		String vv[]=s.split(" ");
		
		for (int i=0; i<vv.length; i++) {
		System.out.println("==>"+vv[i]);

	}
		
		int kk=s.indexOf("y");
		System.out.println(kk);
		
		String hh=s.substring(8, 20);
		System.out.println(hh);
		
		char[] jj=s.toCharArray();
		StringBuffer mm=new StringBuffer();
		for (int i=jj.length-1; i>=0; i--) 
		{
			mm.append(jj[i]);
		}
		System.out.println(mm);
	
	}}

