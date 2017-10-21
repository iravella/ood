package experiments;

class Boat {
	private int numOfMotors = 2;
	
	@Override
	public String toString() {
		return "Boat with " + numOfMotors + " motors";
	}
}

class Horse {
	
}

class BankAccount {
}

class Printer {
	void print(Object obj) {
		System.out.println("The object is: " + obj.toString());
	}
}
public class Polymorphism {

	public static void main(String[] args) {
		Boat b = new Boat();
		Printer p = new Printer();
		p.print(b);
		
		p.print(new Horse());
	}
}
