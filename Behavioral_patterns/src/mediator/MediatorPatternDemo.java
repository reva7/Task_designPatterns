package mediator;

public class MediatorPatternDemo {
	   public static void main(String[] args) {
	      User robin = new User("Robin");
	      User john = new User("Johnson");

	      robin.sendMessage("Hi! Johnson!");
	      john.sendMessage("Hello! Robin!");
	   }
	}