package core_java.Lab_Solutions.Lab1;

public class Operators {
	
	int operand1 = 20;
	int operand2 = 25;

	public static void main(String[] args) {
		
		 int remainder =  remainder(20, 25);  
		   int  quotient = quotient(20,25);
		   System.out.println("remainder is: "+remainder);
		   System.out.println("quotient is: "+quotient);
	}
	public static int remainder(int operand1, int operand2) {
		int Operand1 = operand1;
		int Operand2 = operand2;
		return Operand1/Operand2;
		
	}
	public static int quotient(int operand1, int operand2) {
		int Operand1 = operand1;
		int Operand2 = operand2;
		return Operand1%Operand2;
		
	}

}
