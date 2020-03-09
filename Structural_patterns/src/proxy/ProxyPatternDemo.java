package proxy;

public class ProxyPatternDemo {
	
	   public static void main(String[] args) {
	      Image image = new ProxyImage("test_100.jpg");

	      image.display(); 
	      System.out.println("");
	      
	      image.display(); 	
	   }
	}