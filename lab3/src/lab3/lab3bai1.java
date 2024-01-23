/**
 * 
 */
package lab3;

/**
 * 
 */
import java.util.Scanner;
public class lab3bai1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số nguyên: ");
        int number = scanner.nextInt();
        boolean isPrime = true;

        if (number < 2) {
            isPrime = false;
        } else {
            for (int i = 2; i <= Math.sqrt(number); i++) {
                if (number % i == 0) {
                    isPrime = false;
                    break;
                }
            }
        }

        if (isPrime) {
            System.out.println(number + " là số nguyên tố");
        } else {
            System.out.println(number + " không là số nguyên tố");
        }
	}

}
