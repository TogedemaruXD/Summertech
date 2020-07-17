
public class multiplesOf3And5 {
	public static void main(String[] args) {
		int numbers = 0;
		for(int i = 0; i < 1000; i++) {
			
			if(i % 3 == 0 || i % 5 == 0) {
				numbers += i;
				}
				
			
			
		}
		System.out.println(numbers);
	}
	
}
