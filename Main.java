public class Main
{
	public static int[][] squareArray(int size)
	{
		int[][] arr = new int[size][size];
		for(int i = 0; i < size; i++)
		{
			for(int j = 0; j < size; j++)
			{
				arr[i][j] = (int)(Math.random() * 10) + 1;
			}
		}
		return arr;
	}
	public static int getFirstEvenNumber(int[][] arr)
	{
		for(int i = 0; i < arr.length; i++)
		{
			for(int j = 0; j < arr[i].length; j++)
			{
				if(arr[i][j] % 2 == 0)
					return arr[i][j];
			}
		}
		return -1;
	}
	public static void main(String[] args)
	{
		int[][] arr = squareArray(3);
		for(int i = 0; i < 3; i++)
		{
			for(int j = 0; j < 3; j++)
			{
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println(getFirstEvenNumber(arr));
	}
}