
public class EvenFiboNumbers4Million {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numbers;
		for(int i = 0; i < 4000001; i++){
			numbers = i;
			System.out.println(fib(i));
		}
	}
	public static int fib(int x) {

		if(x <= 2) {
			return x;
		}
		return fib(x-1) + fib(x-2);
	}
}
