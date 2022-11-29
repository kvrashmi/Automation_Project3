package util;

import java.util.Random;




public class Helper {
	
	public static int generateRandomNumber(int boundaryNum)
	{
		Random rnd = new Random();
		int number=rnd.nextInt(boundaryNum);
		return number;
	}
	
	
	
	
	
	
}
