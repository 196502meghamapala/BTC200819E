package welcome;

public class HelloWorld {

	public static void main(String[] args) {
		
		
		String dd = "Java is all about class and objects";
		
		char[] nn=dd.toCharArray();
		StringBuffer bb=new StringBuffer();
		for (int i=nn.length-1; i>=0; i--) 
		{
			bb.append(nn[i]);
		}
		System.out.println(bb);
		
		

	}

}
