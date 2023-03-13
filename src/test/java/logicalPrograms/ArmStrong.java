package logicalPrograms;


public class ArmStrong {

	public static void main(String[] args)
	{
		int number = 371, originalNumber, remainder, result = 0;

        originalNumber = number;

        while (originalNumber != 0)
        {
            remainder = originalNumber % 10;            //371=27+343+1
            result += Math.pow(remainder, 3);           //1634=1+1296+81+256
            originalNumber /= 10;
        }

        if(result == number)
            System.out.println(number + " is an Armstrong number.");
        else
            System.out.println(number + " is not an Armstrong number.");
    
	}

}
