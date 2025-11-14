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
	public static int evenAndNeighbor(int[][] arr)
	{
		for(int i = 0; i < arr.length; i++)
		{
			for(int j = 0; j < arr[i].length; j++)
			{
				if(arr[i][j] % 2 != 0)
					continue;
				if(j == 0 && i == 0 || j == arr[i].length - 1 && i == arr.length - 1)
					continue;
				int upper = -1;
				int lower = -1;
				if(j == 0)
				{
					lower = arr[i - 1][arr[i-1].length - 1];
					upper = arr[i][j+1];
				}
				if(j == arr[i].length - 1)
				{
					upper = arr[i + 1][0];
					lower = arr[i][j-1];
				}
				if(lower + upper > 17)
					return arr[i][j];
			}
		}
		return -1;
	}
	public static void main(String[] args)
	{
		int[][] arr = squareArray(10);
		for(int i = 0; i < 10; i++)
		{
			for(int j = 0; j < 10; j++)
			{
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println(getFirstEvenNumber(arr));
		System.out.println(evenAndNeighbor(arr));
	}
}