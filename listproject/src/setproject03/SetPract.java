package setproject03;

import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.TreeSet;

import org.testng.annotations.Test;

public class SetPract {
	
	public void findUniqueValue(int [] a) {
		HashSet<Integer> hp=new HashSet<>();
		for(int x:a) {
				if(hp.add(x)==false) {
					System.out.println(x+"is duplicate");
			}
			Iterator<Integer> i=hp.iterator();
			while(i.hasNext()) {
				System.out.println(i.next());
			}}}
	
	@Test
	public void test1() {
		int [] a= {5,5,7,7,8,9,5,7,8};
		findUniqueValue(a);
		
		HashSet<String> hp=new HashSet<>();
		hp.add("hi");
		boolean b=hp.add("hi");
		System.out.println(b);
		hp.add("hello");
		Iterator<String> i=hp.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}}
	
	@Test
	public void test12() {
		LinkedHashSet<String> hp=new LinkedHashSet<>();
		hp.add("hi");
		boolean b=hp.add("hi");
		System.out.println(b);
		hp.add("hello");
		Iterator<String> i=hp.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}}
	
	@Test
	public void test142() {
		TreeSet<String> hp=new TreeSet<String>();
		hp.add("tiger");
		boolean b=hp.add("cow");
		System.out.println(b);
		hp.add("hello");
		Iterator<String> i=hp.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}}
	
	class A implements Comparator<String>{
		@Override
		public int compare(String arg0, String arg1) {
			if(arg0.length()>arg1.length()) {
				return 1;
			}else if(arg0.length()<arg1.length()) {
				return -1;
			}else {
		}
		return 0;
	 }}}
	


