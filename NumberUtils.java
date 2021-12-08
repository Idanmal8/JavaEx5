//Idan malka
//315655647
public class NumberUtils {
	/**
	 * this method check if the number that its reciving is a prime number
	 * @param int i, boolean flag , and a loop
	 * @return true or false 
	 * */
	public static boolean isPositivePrime(int number) {
		boolean flag = true;
		int i = 2;
		while (i <= number / 2) {
			if (number % i == 0) 
				flag = false;
			++i;
		}return flag;
	}/**
	 *this method is an method of a factorial number.
	 *@param int fact thats starts at 1 , and a loop.
	 *@return the result of the equation .
	 */
	public static int factorial(int number) {
		int fact = 1;
		if(number < 0) {
			System.out.println(-1);
		}
		for(int i = 1; i <= number; i++)
		{
			fact = fact * i;
		}
		return fact;
	}/**
	 *this method checks if the number is a perfect number.
	 *@param int sum that is 0 , a boolean named flag , and a loop.
	 *@return true if the number is a perfect number.
	 **/
	public static boolean isPerfect(int number) {
		boolean flag = false;
		int sum = 0;
		int i = 0 ;
		for(i = 1 ; i<number ; i++) {
			if(number%i==0) 
				sum = sum + i;

		}if(sum==number) {
			flag = true;
		}return flag;
	}/**
	 *this method returns a string of all the perfect numbers in range of the number that is obtained.
	 *@param a string c , and a loop.
	 *@return the perfect numbers in range of the received number
	 **/
	public static String getPerfects(int number) {	
		String c = "";
		int i = 0;
		int clone = number;
		for(i = 2 ; i<clone ; i++) {
			if(isPerfect(i)) {
				c += i + "," ;
			}
		}return c;
	}/**
	 *this method checks if the sum of the first number digit is equal to the second number .
	 *@param sum that start at 0 , a default boolean and a loop.
	 *@return true if the sum of the first number digits is equals to the second number.
	 **/
	public static boolean isSumDigits(int number, int someSum) {
		boolean flag = false;
		int sum = 0;
		while(number > 0) {
			sum = sum+number%10;
			number= number/10;
			if(sum == someSum) {
				flag = true;
			}
		}return flag;
	}/**
	 *this method checks if the digits in the number is ascending .
	 *@param default boolean , clone that is a copy of the number , and the currenDigit which is always the last digit.
	 *@return true if the numbers digits are ascending in order.
	 **/
	public static boolean isAscending(int number) {
		boolean flag = false;
		int clone = number;
		int currentDigit = clone % 10;
		clone = clone/10;
		while(clone>0){
			if(currentDigit <= clone % 10){
				break;
			}
			if(clone < currentDigit)
				flag =true;
			currentDigit = clone % 10;
			clone = clone/10;
		}return flag;
	}/**
	 *this method checks if the numbers are unique numbers .
	 *@param n1 that is copy of the number , lastDigit that is the last digit in the number , n2 that is another copy of the number and a counter.
	 *@return true if the number is a unique number.
	 **/
	public static boolean areUniqueDigits(int number) {
		int n1 = number; 
		int lastDigit = 0;
		int n2; 
		int count; 
		while(n1 != 0) {
			lastDigit = n1 % 10;
			n2 = number;
			count = 0;
			while(n2 != 0) {
				if(lastDigit == n2%10)
					count++;
				n2 /= 10;
			}
			if(count != 1)
				return false;
			n1 /= 10;
		}
		return true;
	}/**
	 *this method checks if the 2 numbers that are received does not have any same digit at all.
	 *@param n1 , n2 that are copy to the numbers , endOfDigits that are a Int to string value to check length , a counter , and lastDigit1 that is  the last digit of number1.
	 *@return true if the numbers does not have a single digit that is alike .
	 **/
	public static boolean areDisjoint(int number1, int number2) {
		int n1 = number1;
		int n2 = number2;
		int endOfDigits = String.valueOf(number1).length();
		int lastDigit1 = 0;
		int count = 0;
		for(int i = 0 ; i<endOfDigits ; i++){
			lastDigit1 = n1%10;
			n2 = number2;
			n1= n1/10;
			for(int j = 0 ; j<n2; j++) {
				n2 /= 10;
				if(lastDigit1 == n2%10) {
					count++;
					n2 /= 10;
				}
				if(count > 0) {
					return false;
				}
			} n1=n1/10;

		}return true;
	}/**
	 *this method is creating a square which has two right angle triangle according to the number that is received.
	 *@param 3 loops , the primary loop that is in charge of the "rows" , and too secondary that are in charge of the * and the numbers.
	 *@return a square with ascending numbers until the number obtained in the method.
	 **/
	public static void printNumberTriangle(int n) {
		for (int i = 1; i <= n; i++) {
			for (int j = n; j > i; j--) {
				System.out.print("*" + " ");
			}
			for (int j = 1; j <= i; j++) {
				System.out.print(j + " ");
			}
			System.out.println();
		}
	}
}
