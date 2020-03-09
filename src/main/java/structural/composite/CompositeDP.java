package structural.composite;

public class CompositeDP {
	   public static void main(String[] args) {
		  Student leader = new Student("Arpitha","CSE", 1);
	      Student CSE1 = new Student("Rahul","CSE", 1);

	      Student EEE1 = new Student("Robert","EEE", 2);

	      Student IT1 = new Student("Michel","IT", 1);

	      Student CSE2 = new Student("Laura","CSE", 1);
	      Student EEE2 = new Student("Bob","EEE", 2);

	      Student EEE3 = new Student("Richard","EEE", 1);
	      Student CSE3 = new Student("Rob","CSE", 2);

	      CSE1.add(CSE2);
	      CSE1.add(CSE3);

	      EEE1.add(EEE2);
	      EEE1.add(EEE3);
	      leader.add(CSE1);
	      leader.add(EEE1);
	      leader.add(IT1);
	      //print all Students of the organization
	      System.out.println(leader); 
	      
	      for (Student headStudent : leader.getSubordinates()) {
	         System.out.println(headStudent);
	         
	         for (Student Student : headStudent.getSubordinates()) {
	            System.out.println(Student);
	         }
	      }		
	   }
	}