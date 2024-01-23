/**
 * 
 */
package lab3;

/**
 * 
 */
import java.util.Arrays;
import java.util.Scanner;
public class lab3bai3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số lượng phần tử trong mảng: ");
        int n = scanner.nextInt();
        int[] array = new int[n];

        System.out.println("Nhập các phần tử của mảng:");
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }

        // Sắp xếp mảng
        Arrays.sort(array);

        System.out.println("Mảng sau khi sắp xếp:");
        for (int i = 0; i < n; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();

        // Tìm giá trị nhỏ nhất
        int min = array[0];
        for (int i = 1; i < n; i++) {
            min = Math.min(min, array[i]);
        }
        System.out.println("Giá trị nhỏ nhất trong mảng: " + min);

        // Tính trung bình cộng các số chia hết cho 3
        int sum = 0;
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (array[i] % 3 == 0) {
                sum += array[i];
                count++;
            }
        }
        double average = (double) sum / count;
        System.out.println("Trung bình cộng các số chia hết cho 3: " + average);
	}

}
