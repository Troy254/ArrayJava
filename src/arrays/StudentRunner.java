package arrays;

import java.math.BigDecimal;

public class StudentRunner {

	public static void main(String[] args) {
		int[] marks = { 93, 96, 97, 99 };
		
		Student student = new Student("Troy Andati", 93, 96, 97, 99 );
		
		int number = student.getNumberOfMarks();
		System.out.println("Number of Marks: " + number);
		
		int sum = student.getSumOfMarks();
		System.out.println("Sum Of Marks: " + sum);
		
		int maximum = student.getMaximumMarks();
		System.out.println("Maximum Mark: " + maximum);
		
		int minimum = student.getMinimumMark();
		System.out.println("Minimum Mark: " + minimum);
		
		BigDecimal average = student.getAverageMark();
		System.out.println("Average Mark: " + average);
		
		System.out.println(student);
		
		student.addMark(79);
		System.out.println(student);
		
		student.removeIndexOf(3);
		System.out.println(student);
		

	}

}
