package collections;

import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
class DescStudentComparator implements Comparator<Student>
{

	@Override
	public int compare(Student student1, Student student2) {
		// TODO Auto-generated method stub
		return Integer.compare(student1.getId(),student2.getId());
	}
	
}
public class StudentClassRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Student> students = new ArrayList<>();
			students.add(new Student(1, "Pavan"));
			students.add(new Student(100, "Kalyan"));
			students.add(new Student(2, "Prem"));
			
			ArrayList<Student> studentsAl=new ArrayList<>(students);
		
			Collections.sort(studentsAl);
			System.out.println(studentsAl);
			Collections.sort(studentsAl,new DescStudentComparator());
			System.out.println(studentsAl);
			
	}
}
