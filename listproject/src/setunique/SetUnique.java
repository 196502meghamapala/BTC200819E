package setunique;

import java.util.HashSet;
import java.util.Iterator;

import org.testng.annotations.Test;

public class SetUnique {
	
	@Test
	public void setUniqueValue() {
		
		String s= "aabbccdd";
		char[] c= s.toCharArray();
		HashSet<Character> h=new HashSet<>();
		for (Character x:c) {
			h.add(x);
			
			Iterator<Character> l =h.iterator();
			while(l.hasNext()) {
				System.out.println(l.next());
			}}}}
