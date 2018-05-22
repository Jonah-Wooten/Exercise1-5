import java.util.Scanner;

public class Exercise5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);

		String cont = "y";
		while (cont.equalsIgnoreCase("y")) {

			System.out.println("Please Enter A Number");
			double input = scan.nextInt();
			System.out.println("Please enter another number");
			double input2 = scan.nextInt();
			double product = 0;
			product = input * input2;
			System.out.println(product);

			System.out.println("Would you like to continue Y/N");
			String input3 = scan.next();
			if (input3.equalsIgnoreCase("n")) {

				System.out.println("Goodbye!");
				break;
			}
		}
	}
}