package stringmanupulation_0001;

import org.testng.annotations.Test;

public class St_Man {
	
	@Test
	public void string_Man() {
		
		String s2="Everest is the highest mountain in the world";
		String s4[]=s2.split(" ");
		for(int i=0; i<s4.length; i++) {
			System.out.println(s4[i]);
		}
		
		char[] s5=s2.toCharArray();
		StringBuffer s6=new StringBuffer();
		for (int i=s5.length-1; i>=0; i--) {
			s6.append(s5[i]);
		}System.out.println(s6);
		
		
	}

}
