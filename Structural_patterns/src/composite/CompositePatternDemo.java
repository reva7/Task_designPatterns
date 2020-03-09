package composite;
public class CompositePatternDemo {
	   public static void main(String[] args) {
	   
	      Employee CEO = new Employee("Johnson","CEO", 3670000);

	      Employee headSales = new Employee("Robins","SalesManager", 50000);

	      Employee headMarketing = new Employee("Michel","Head Marketing", 35000);

	      Employee clerk1 = new Employee("Laura","Marketing", 20000);
	      Employee clerk2 = new Employee("Bob","Marketing", 20000);

	      Employee salesExecutive1 = new Employee("Richard","Sales", 15000);
	      Employee salesExecutive2 = new Employee("Rob","Sales", 15000);

	      CEO.add(headSales);
	      CEO.add(headMarketing);

	      headSales.add(salesExecutive1);
	      headSales.add(salesExecutive2);

	      headMarketing.add(clerk1);
	      headMarketing.add(clerk2);

	      //print all employees of the organization
	      System.out.println(CEO); 
	      
	      for (Employee headEmployee : CEO.getSubordinates()) {
	         System.out.println(headEmployee);
	         
	         for (Employee employee : headEmployee.getSubordinates()) {
	            System.out.println(employee);
	         }
	      }		
	   }
	}