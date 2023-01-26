package stringbuffer;

public class StringBufferMutable {
	public static void main(String[] args) {
		StringBuffer sb=new StringBuffer("hello");
		//System.out.println(sb);
		
		sb=sb.append("java");
		
		System.out.println(sb);
		
		
		System.out.println(sb.length());
		
		System.out.println(sb.charAt(4));
		
		//System.out.println(sb.reverse());

		
		System.out.println(sb.insert(5, "coding"));
		
		System.out.println(sb.delete(5, 11));
		
		sb.replace(0, 5, "hi");
		System.out.println(sb);
		
		String s=sb.toString();
		
		
		
		
		
		
	}

}
