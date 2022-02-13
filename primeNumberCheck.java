import java.util.Scanner;

public class primeNumberCheck {
	
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);{
		System.out.println("Enter the number");
		int num= sc.nextInt();
		
		
		boolean isPrime = checkPrime(num);
		if(isPrime) {
			System.out.println("It is a prime number");
		}else {
			System.out.println("It is a composite number");
		}
		}
	
}
	
	public static boolean checkPrime(int n) {
		int cnt=0;
		for(int i=2; i<n; i++) {
			if(n % i ==0) {
				cnt++;
			}
		}
		if(cnt > 0) {
			return false;
		}
		else {
			return true;
		}
	}

}
