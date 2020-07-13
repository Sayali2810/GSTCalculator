import java.io.IOException;
	import java.util.InputMismatchException;
	import java.util.Scanner;
public class GstCalculator 
{
	public static void main(String[] args) throws ExceptionHandle
	{
		try 
		{
			Calculation cal = new Calculation();
			Scanner scan = new Scanner(System.in);
			System.out.println("Enter The Units Of Product: ");
			int unit = scan.nextInt();

			System.out.println("Enter The Commodity Of Product: ");
			String commodity=scan.next();

			System.out.println("Enter The Price Of Product: ");
			double price = scan.nextDouble();
			System.out.println("----------------------------------------------------");
			System.out.println("Enter The Category Of Product: ");
			System.out.println("1 for food-grains ");
			System.out.println("2 for furniture");
			System.out.println("3 for electronics");
			System.out.println("4 for cosmetic");
			int category = scan.nextInt();
			System.out.println("----------------------------------------------------");

			switch (category) 
			{
				case 1:
					double value = cal.calulator(unit, price, "food-grains");
					System.out.println("Final Price Of Product: " + value);
					break;

				case 2:
					double value1 = cal.calulator(unit, price, "furniture");
					System.out.println("Final Price Of Product: " + value1);
					break;

				case 3:
					double value2 = cal.calulator(unit, price, "electronics");
					System.out.println("Final Price Of Product: " + value2);
					break;

				case 4:
					double value3 = cal.calulator(unit, price, "cosmetics");
					System.out.println("Final Price Of Product: " + value3);
					break;

				default:
					System.out.println("Please Select Appropriate Category");
					break;
			}
		}
		catch (InputMismatchException e) 
		{
				System.out.println(ExceptionHandle.ExceptionType.INVALID_DATA);
		}

	}
}



