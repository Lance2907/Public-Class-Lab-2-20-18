
import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner (System.in);
		
		System.out.println("Enter the First Number");
				
		int number1 = scanner.nextInt();
		
		
		System.out.println("Enter the Second Number");
		
		int number2 = scanner.nextInt();

		
		System.out.print("Which one would you like to choose?");
		System.out.println("For addition enter 1, For subtraction enter 2, For multiplication enter 3, For divison enter 4");
		int decision = scanner.nextInt();
		
		if (decision == 1){
		System.out.println(addnumbers(number1, number2));
		}else if(decision == 2){
			System.out.println(subtractnumbers(number1, number2));	
			}else if(decision == 3){
				System.out.println(multiplynumbers(number1, number2));	
			}else if(decision == 4){
				System.out.println(dividingnumbers(number1, number2));	
			}
	}
	public static int addnumbers (int num1, int num2){
		int add = num1 + num2;
		return add;
	}
	public static int subtractnumbers (int num1 , int num2){
		int subtract = num1 - num2;
		return subtract;
	}
public static int dividingnumbers (int num1 , int num2){
	int divide = num1 / num2;
	return divide;
}
public static int multiplynumbers (int num1, int num2){
	int multiply = num1 * num2;
	return multiply;
}
}
