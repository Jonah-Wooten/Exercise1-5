import java.util.Scanner;

public class Exercise2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		String cont = "y";
		while (cont.equalsIgnoreCase("y")) {

			System.out.println("Please Enter A Number");
			int input = scan.nextInt();
			System.out.println(input + 1);
			System.out.println("Would you like to continue Y/N");
			String input2 = scan.next();

			if (input2.equalsIgnoreCase("n")) {

				System.out.println("Goodbye!");
				break;

			}
		}
		scan.close();

	}
}