
public class Shapes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//for i in range (0,10,2) 
		int size = 10;
		//prints a square of size
		for (int i = 0; i < size; i +=1)
		{
			
			for(int j = 0; j < size; j ++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
		//prints a bottom left triangle
		System.out.println();
		for (int i = 0; i < size; i +=1)
		{
			
			for(int j = 0; j < i; j ++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
		//prints a top left triangle
		System.out.println();
		for (int i = 0; i < size; i ++)
		{
			
			for(int j = 0; j < size - i; j ++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
		//print a top right triangle
		System.out.println();
		for (int i = 0; i < size; i ++)
		{
			for(int k = 0; k < i; k++)
			{
				System.out.print("  ");
			}
			for(int j = 0; j < size - i; j ++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
		//print a bottom right triangle
				System.out.println();
				for (int i = 0; i < size; i ++)
				{
					for(int k = 0; k < size - i; k++)
					{
						System.out.print("  ");
					}
					for(int j = 0; j < i; j ++)
					{
						System.out.print("* ");
					}
					System.out.println();
				}
		
	}
 
}
