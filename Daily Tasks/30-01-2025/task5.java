package sample;
import java.util.Scanner;
public class task5 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter string:");
		String str=sc.next();
		StringBuilder sb=new StringBuilder();
		for(int i=0;i<str.length();i++) {
			char ch=str.charAt(i);
			if(i%2==0) sb.append(Character.toUpperCase(ch));
			else sb.append(Character.toLowerCase(ch));
		}
		System.out.println(sb.toString());
	}
}
