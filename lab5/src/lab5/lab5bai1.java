/**
 * 
 */
package lab5;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
/**
 * 
 */
public class lab5bai1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Double> list = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        // Nhập danh sách số thực từ bàn phím
        while (true) {
            System.out.print("Nhập số thực (Nhập 'q' để kết thúc): ");
            String input = scanner.nextLine();
            if (input.equalsIgnoreCase("q")) {
                break;
            }
            try {
                double number = Double.parseDouble(input);
                list.add(number);
            } catch (NumberFormatException e) {
                System.out.println("Sai định dạng số thực. Vui lòng nhập lại.");
            }
        }

        // Xuất danh sách vừa nhập
        System.out.println("Danh sách số thực bạn vừa nhập:");
        for (double number : list) {
            System.out.println(number);
        }

        // Tính tổng danh sách số thực
        double sum = 0;
        for (double number : list) {
            sum += number;
        }
        System.out.println("Tổng của danh sách số thực là: " + sum);
	}

}
