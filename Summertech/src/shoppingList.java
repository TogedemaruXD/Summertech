import java.util.Scanner;

public class shoppingList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		String [] list = new String [5];
		while (true) {
			System.out.println("what would you like to add or remove from the shopping list");
			String userinput = input.nextLine();

			if (userinput.contains("add") || userinput.contains("Add"))
			{
				System.out.println("What would you like to add?");
				String useradd = input.nextLine();
				int size = 0;
				for(int i = 0; i < list.length; i++ )
				{
					if(list[i] == null)
					{
						list[i] = useradd;
						System.out.println(list[i]);
						break;

					}
					size += 1;
				}
				if(size == list.length)
				{
					String[] temp = new String[list.length + 1];
					for(int i = 0; i < list.length; i++)
					{
						temp[i] = list[i];
					}
					temp[list.length] = useradd;
					list = temp;
				}
			}
			else if(userinput.contains("remove") || userinput.contains("delete"))
			{
				System.out.println("What would you like to remove?");
				
				String userdelete = input.nextLine();
				for(int i = 0; i < list.length; i++)
				{
					if  (list[i] != null)
					{
						if(list[i].contains(userdelete))
						{
							list[i] = " ";

						}
					}
				}

			} 
			for(String i:list)
			{
				System.out.println(i);
			}
		}
		
	}


}
