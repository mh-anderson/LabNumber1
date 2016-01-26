import java.io.IOError;
import java.util.Scanner;

public class Lab1App {
	public static void main(String[] args) {

		System.out.println("You're about to calculate the area, perimeter, and volume of a room!");
		System.out.println("");
		System.out.println("All that you have to do is enter the length, width, and height of the room in question.");
		System.out.println("");

		Scanner sc = new Scanner(System.in);
		String choice = "y";
		
		while (choice.equalsIgnoreCase("y")) {
			
			System.out.print("Please enter the length: ");
			double length = Double.parseDouble(sc.nextLine());
			
			System.out.print("Please enter the width: ");
			double width = Double.parseDouble(sc.nextLine());

			System.out.print("Please enter the height: ");
			double height = Double.parseDouble(sc.nextLine());

			double area = length * width;
			double perimeter = length * 2 + width * 2;
			double volume = length * width * height;

			System.out.println("\nThe area of your room is: " + area + "\nThe perimeter of your room is: " + perimeter
					+ "\n" + "The volume of your room is: " + volume + "\n");
			System.out.println(
					"Do you want to make another calculation? \nPlease enter (Y)es to proceed or (N)o to quit: ");
			choice = sc.nextLine();
			System.out.println();
		}
		sc.close();
		System.out.println("Good, I didn't want to help you anyways. Goodbye.");
	}
}