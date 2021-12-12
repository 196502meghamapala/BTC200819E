package stringmanupulation08;

public class String_Man {

	public static void main(String[] args) {
		
		String ff = "my space http dot come z";
		char[] pp=ff.toCharArray();
		StringBuffer ll=new StringBuffer();
		for (int i=pp.length-1; i>=0; i--) {
			ll.append(pp[i]);
		}System.out.println(ll);
		
		int bb=ff.indexOf("z");
		System.out.println(bb);

	}

}
