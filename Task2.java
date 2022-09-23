import java.util.Arrays;

public class Task2
{

	public static void main(String[] args)
	{
		int[] array0 =
		{ 1, 77, -5, 2, 65, 30 };
		int[] array1 =
		{ -10, 50, 15, 2, 77 };
		System.out.println("First Array: " + Arrays.toString(array0));
		int num1 = 77;
		int num2 = 65;

		System.out.println("Answer: " + answer(array0, num1, num2));

		System.out.println("Second Array: " + Arrays.toString(array1));
		System.out.println("Answer: " + answer(array1, num1, num2));

	}

	public static boolean answer(int[] array0, int num1, int num2)
	{
		for (int number : array0)
		{
			boolean a = number != num1 && number != num2;
			if (a)
			{
				return true;
			}
		}
		return false;
	}
}
