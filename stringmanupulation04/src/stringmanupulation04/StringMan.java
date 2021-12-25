package stringmanupulation04;

import java.util.Scanner;

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
		
		Scanner sc5= new Scanner(System.in);
		String d=sc5.nextLine();
		System.out.println(d);
		int f=sc5.nextInt();
		System.out.println(f);
		
		char[] m=b.toCharArray();
		StringBuffer cd=new StringBuffer();
		for (int i=m.length-1; i>=0; i--) {
			cd.append(m[i]);
		}System.out.println(cd);
		}}
