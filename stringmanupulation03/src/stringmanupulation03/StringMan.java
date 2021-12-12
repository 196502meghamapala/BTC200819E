package stringmanupulation03;

public class StringMan {
	
	public static void main(String []args) {
	
	String s = "December is last month of the year";
	char[] jj=s.toCharArray();
	StringBuffer ll=new StringBuffer();
	for (int i=jj.length-1; i>=0; i--) {
		ll.append(jj[i]);
	}System.out.println(ll);
	
	
	}
}
