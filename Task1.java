
public class Task1
{

	public static void main(String[] args)
	{
		int[] array0 =
		{ 1, 5, -5, 2, 12, 30 };
		int[] array1 =
		{ -10, 50, 15, 2 };
		for (int i = 0; i < array0.length; i++)
		{
			for (int n = 0; n < array1.length; n++)
			{
				if (array0[i] == array1[n])
				{
					System.out.println(array0[i]);
				}
			}
		}

	}

}
