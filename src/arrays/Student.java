package arrays;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.Arrays;

public class Student {

	private String name;
	private ArrayList<Integer> marks = new ArrayList<>();

	public Student(String name, int...marks) {
		this.name = name;
		for(int mark : marks) {
		this.marks.add(mark);
		}
	}

	public int getNumberOfMarks() {
		return marks.size();
	}

	public int getSumOfMarks() {
		int sum = 0;
		for(int mark : marks) {
			sum = sum + mark;
		}
		return sum;
	}

	public int getMaximumMarks() {
		int max = Integer.MIN_VALUE;
		for(int mark : marks) {
			if(mark > max) {
				max = mark;
			}
		}
		return max;
	}

	public int getMinimumMark() {
		int min = Integer.MAX_VALUE;
		for(int mark : marks) {
			if(mark < min) {
				min = mark;
			}
		}
		return min;
	}

	public BigDecimal getAverageMark() {
		int sum = getSumOfMarks();
		BigDecimal average = new BigDecimal(sum).divide(new BigDecimal(marks.size()),3,RoundingMode.UP);
		return average;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", marks=" + marks + "]";
	}

	public void addMark(int i) {
		marks.add(i);
		
	}
	
	

	public void removeIndexOf(int index) {
		marks.remove(index);
	}}


