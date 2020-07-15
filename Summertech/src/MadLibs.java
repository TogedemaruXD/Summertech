import java.util.Scanner;

public class MadLibs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Type a Color");
		String color = input.next();
		
		System.out.println("Type a Superlative");
		String superlative = input.next();
				
		System.out.println("Type a Adjective");
		String adj1 = input.next();
		
		System.out.println("Type a Plural Body Part");
		String bodyplural = input.next();
	
		System.out.println("Type a Body Part");
		String body = input.next();
		
		System.out.println("Type a Noun");
		String noun = input.next();		
		
		System.out.println("Type a group of animals");
		String animals = input.next();
				
		System.out.println("Type a Adjective");
		String adj2 = input.next();		
		
		System.out.println("Type a Adjective");
		String adj3 = input.next();
		
		System.out.println("Type a Adjective");
		String adj4 = input.next();
		
		System.out.println("The " + color + " Dragon is the " + superlative + " Dragon of all. ");
		System.out.println("It has " + adj1 + " " + bodyplural + ", and a " + body + " shaped like a " + noun + "."); 
		System.out.println("It loves to eat " + animals + ", although it will feast on nearly anything.");
		System.out.println("It is " + adj2 + " and " + adj3 + ". You must be " + adj4 + " around it, or you may end up as it`s meal!");
		
		input.close();
	}

}
