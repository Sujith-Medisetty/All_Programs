package StringsDemo;

// StringBuilder is same as StringBuffer but it is not synchronized.
public class StringBufferDemo {
public static void main(String[] args) {
	
	StringBuffer sb=new StringBuffer("Sujith");
	sb.append(" Gupta");
	sb.replace(0, 3, "...");
	System.out.println(sb.substring(1));
	System.out.println(sb.substring(0, 3));
	System.out.println(sb);
	sb.delete(0, 3);
	System.out.println(sb);

}
}
