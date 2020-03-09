package structural.composite;


import java.util.ArrayList;
import java.util.List;

public class Student {
   private String name;
   private String dept;
   private int section;
   private List<Student> sections;

   // constructor
   public Student(String name,String dept, int sec) {
      this.name = name;
      this.dept = dept;
      this.section = sec;
      sections = new ArrayList<Student>();
   }

   public void add(Student e) {
      sections.add(e);
   }

   public void remove(Student e) {
      sections.remove(e);
   }

   public List<Student> getSubordinates(){
     return sections;
   }

   public String toString(){
      return ("Employee :[ Name : " + name + ", dept : " + dept + ", section :" + section+" ]");
   }   
}