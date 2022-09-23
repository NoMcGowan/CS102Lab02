
public class Task3
{

	public static void main(String[] args)
	{
		char[] intArray =
		{ 's', 'a', 'b', 'a' };

		System.out.println("Original Array:");
		for (int i = 0; i < intArray.length; i++)
			System.out.print(intArray[i] + "  ");

		System.out.println();

		System.out.println("Original Array printed in reverse order:");
		for (int i = intArray.length - 1; i >= 0; i--)
			System.out.print(intArray[i] + "  ");
	}

}
