import java.util.Scanner;

public class Main {

	Scanner sc = new Scanner(System.in);

	// function to checkPalindrome

	public void checkPalindrome() {

		System.out.print("Enter a number:");
		int n = sc.nextInt();
		int temp = n;
		int m = 0;
		if (n < 0) {
			System.out.println("Negative numbers are not palindromic");
		} else if (n >= 0 && n <= 9) {
			System.out.println("Palindrome number");
		} else if (n >= 10 && n <= 99) {
			if (n % 11 == 0) {
				System.out.println("Palindrome number");
			} else {
				System.out.println("Not a palindrome number");
			}
		} else {
			while (n > 0) {
				int d = n % 10;
				n /= 10;
				m = m * 10 + d;
			}

			if (temp == m) {
				System.out.println("Palindrome number");
			} else {
				System.out.println("Not a Palindrome number");
			}
		}

	}

	// function to printPattern

	public void printPattern() {

		System.out.print("Enter a number:");
		int n = sc.nextInt();
		if (n <= 0) {
			System.out.println("Please enter a valid number which is greater than 0");
		} else if (n == 1) {
			System.out.println("*");
		} else if(n==2) {
			System.out.println("**");
			System.out.println("*");
		}else {
			for (int i = n; i >= 1; i--) {
				for (int j = 1; j <= i; j++) {
					System.out.print("*");
				}
				System.out.println();
			}
		}
	}

	// function to check no is prime or not

	public void checkPrimeNumber() {

		System.out.print("Enter a number:");
		int n = sc.nextInt();
		boolean isPrime = true;
		if(n<0) {
			System.out.println("Negative numbers are not prime");
		}else {
			if (n==0 || n == 1) {
				isPrime = false;
			} else if (n == 2 || n == 3) {
				isPrime = true;
			} else if (n % 2 == 0 || n % 3 == 0) {
				isPrime = false;
			} else {
				for (int i = 5; i * i <= n; i = i + 6) {
					if (n % i == 0 || n % (i + 2) == 0) {
						isPrime = false;
						break;
					}
				}
			}
			if (!isPrime) {
				System.out.println("Not a prime number");
			} else {
				System.out.println("Prime number");
			}
		}
	}

	// function to print Fibonacci Series

	public void printFibonacciSeries() {

		System.out.print("Enter a number:");
		int n = sc.nextInt();
		int first = -1, second = 1;
		for (int i = 1; i <= n; i++) {
			int temp = first + second;
			System.out.print(temp + ",");
			first = second;
			second = temp;
		}

	}

//main method which contains switch and do while loop

	public static void main(String[] args) {

		Main obj = new Main();

		int choice;

		Scanner sc = new Scanner(System.in);

		do {

			System.out.println("Enter your choice from below list.\n" + "1. Find palindrome of number.\n"

					+ "2. Print Pattern for a given no.\n" + "3. Check whether the no is a  prime number.\n"

					+ "4. Print Fibonacci series.\n" + "--> Enter 0 to Exit.\n");

			System.out.println();

			choice = sc.nextInt();

			switch (choice) {

			case 0:

				choice = 0;

				break;

			case 1: {

				obj.checkPalindrome();

			}

				break;

			case 2: {

				obj.printPattern();

			}

				break;

			case 3: {

				obj.checkPrimeNumber();

			}

				break;

			case 4: {

				obj.printFibonacciSeries();

			}

				break;

			default:

				System.out.println("Invalid choice. Enter a valid no.\n");

			}

		} while (choice != 0);

		System.out.println("Exited Successfully!!!");

		sc.close();

	}

}
