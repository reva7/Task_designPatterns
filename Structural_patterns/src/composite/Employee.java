package composite;

import java.util.ArrayList;
import java.util.List;

public class Employee {
   private String name;
   private String dept;
   private int salary;
   private List<Employee> emp;

   // constructor
   public Employee(String name,String dept, int sal) {
      this.name = name;
      this.dept = dept;
      this.salary = sal;
      emp = new ArrayList<Employee>();
   }

   public void add(Employee e) {
      emp.add(e);
   }

   public void remove(Employee e) {
      emp.remove(e);
   }

   public List<Employee> getSubordinates(){
     return emp;
   }
   
   public String toString(){
	      return ("Employee :[ Name : " + name + ", dept : " + dept + ", salary :" + salary+" ]");
	   }
}