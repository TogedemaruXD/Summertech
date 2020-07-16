import java.util.Scanner;

public class cabinet {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		// TODO Auto-generated method stub
		String [] [] cabinet = new String [] []
				{
			new String [] {" ", " ", " "},
			new String [] {" ", " ", " "},
			new String [] {" ", " ", " "}
				};
				System.out.println("add or remove an item?");
				String userinput = input.nextLine();
				if(userinput.equals("add"))
				{
					System.out.println("what would you like to add?");
					useradd = input.nextLine();
				}
				else if(userinput.equals("remove"))
				{
					System.out.println("what would you like to remove?");
					userremove = input.nextLine();
				}
	}

}
