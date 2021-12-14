package string_man_100;

public class String_Man_100 {

	public static void main(String[] args) {
		
		String ss = "Welcome to Hello World BT";
		char[] ss1=ss.toCharArray();
		StringBuffer jj=new StringBuffer();
		for (int i=ss1.length-1; i>=0; i--) 
		{
			jj.append(ss1[i]);
		}
		System.out.println(jj);
		}
        }
