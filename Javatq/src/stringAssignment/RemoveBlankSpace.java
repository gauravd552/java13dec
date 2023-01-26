package stringAssignment;

public class RemoveBlankSpace {

	public static void main(String[] args) {
		//String s1=" G a u r a v ";
		//System.out.println(s1.replaceAll("\s",""));
		String s1="Gaurav";
		String s2="Window";
		s1=s1.replaceAll("[^aeiouAEIOU]","");
		System.out.println(s1);
		s2=s2.replaceAll("[^aeiouAEIOU]","");
		System.out.println(s2);
    
	}

}
