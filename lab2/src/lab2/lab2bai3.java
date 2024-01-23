/**
 * 
 */
package lab2;

/**
 * 
 */
import java.util.Scanner;
public class lab2bai3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập số điện sử dụng trong tháng: ");
        double soDien = scanner.nextDouble();

        double tien;
        if (soDien <= 50) {
            tien = soDien * 1000;
        } else {
            tien = 50 * 1000 + (soDien - 50) * 1200;
        }

        System.out.println("Tiền điện: " + tien + " đồng");
	}

}
