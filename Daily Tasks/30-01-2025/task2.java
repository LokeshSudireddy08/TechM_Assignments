package sample;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
class Student{
	int[] marks;
	String name;
	int total;
	double average;
	void Student(String name,int[] marks) {
		this.name=name;
		this.marks=marks;
		this.total=Arrays.stream(marks).sum();
        this.average = (double) total / marks.length;
	}
}
public class task2 {
	public static void main(String[] args) {
		List<Student> students = new ArrayList<>();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter total students");
		int num=sc.nextInt();
		while(num-->0){
			System.out.println("Enter name");
			String name=sc.next();
			System.out.println("Enter number of subjects");
			int subjects=sc.nextInt();
			int[] marks=new int[subjects];
			for(int i=0;i<subjects;i++) {
				System.out.println("enter marks of subject"+i+":");
				marks[i]=sc.nextInt();
			}
			students.add(new Student(name,marks));
		}
	}
}
