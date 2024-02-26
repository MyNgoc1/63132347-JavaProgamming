/**
 * 
 */
package lab6;
import java.util.Scanner;
/**
 * 
 */
public class lab6bai1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập họ và tên: ");
        String hoTen = scanner.nextLine();

        int index = hoTen.indexOf(" ");
        String ho = hoTen.substring(0, index);
        String tenDem = hoTen.substring(index + 1, hoTen.lastIndexOf(" "));
        String ten = hoTen.substring(hoTen.lastIndexOf(" ") + 1);

        System.out.println("Họ: " + ho.toUpperCase());
        System.out.println("Tên đệm: " + tenDem);
        System.out.println("Tên: " + ten.toUpperCase());
	}

}
