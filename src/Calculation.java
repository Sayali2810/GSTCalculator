import java.io.IOException;
import java.util.InputMismatchException;

import javax.imageio.IIOException;
public class Calculation 
{
	public int foodgrainGST = 0; // GST %
	int furnitureGST = 5; // GST %
	int electronicsGST = 18; // GST %
	int cosmeticGST = 28; // GST %
	
	public double calulator(int unit, double price, String category)
	{
		try
		{
			double gstamount = 0;
			switch (category) 
			{
				case "food-grains":
					gstamount = (price * (foodgrainGST)) / 100;
					break;
				case "furniture":
					gstamount = (price * (furnitureGST)) / 100;
					break;
				case "electronics":
					gstamount = (price * (electronicsGST)) / 100;
					break;
				case "cosmetics":
					gstamount = (price * (cosmeticGST)) / 100;
					break;
				default:
					break;
			}
		
				System.out.println("GST Applicable Per Unit: " + gstamount);
				return unit * (gstamount + price);
		}
		catch (RuntimeException e) 
		{
			System.out.println(ExceptionHandle.ExceptionType.CALCULATION_ERROR);
		}
		return (Double) null;
	}
}


