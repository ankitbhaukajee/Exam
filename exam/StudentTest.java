package exam;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StudentTest {
	public static void main(String [] args){
		List<Employee> students = new ArrayList<Employee>();
		students.add(new Employee(2, "Subham", new Address("Arizona", 1179)));
		students.add(new Employee(1, "Ankit", new Address("Germantown", 2702)));
		
		students.add(new Employee(3, "Sumarika", new Address("Michigan", 44907)));
		
		students.add(new Employee(4, "Ujwal", new Address("Freidrick", 2702)));
		
		//Sorting using Comparable
		Collections.sort(students);
		System.out.println("Sorting using Comparable");
		students.forEach(System.out::println);
		
		
		//Sorting using Comparator
		System.out.println("_______________________________");
		System.out.println("Sorting using Comparator");
		Collections.sort(students,
						(o1,o2)->o1.getAddress().getZipCode().compareTo(o2.getAddress().getZipCode())==0?
								o1.getId().compareTo(o2.getId()):
									o1.getAddress().getZipCode().compareTo(o2.getAddress().getZipCode())
						);
		students.forEach(System.out::println);
	}

}
