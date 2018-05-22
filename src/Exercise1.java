import java.util.Scanner;

public class Exercise1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);

		String cont = "y";
		while (cont.equalsIgnoreCase("y")) {
			System.out.println("Please enter a String");

			String input = scan.nextLine();

			System.out.println(input);

			System.out.println("Would you like to continue? Y/N");
			String input2 = scan.nextLine();
			if (input2.equalsIgnoreCase("n")) {
				System.out.println("Goodbye");
				break;
			}
		}
		scan.close();
	}

}
