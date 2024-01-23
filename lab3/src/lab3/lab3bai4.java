/**
 * 
 */
package lab3;

/**
 * 
 */
import java.util.Scanner;
public class lab3bai4 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số lượng sinh viên: ");
        int n = scanner.nextInt();
        scanner.nextLine(); // Đọc bỏ dòng new line

        String[] names = new String[n];
        double[] scores = new double[n];
        String[] grades = new String[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Nhập thông tin cho sinh viên thứ " + (i + 1) + ":");
            System.out.print("Họ tên: ");
            names[i] = scanner.nextLine();
            System.out.print("Điểm: ");
            scores[i] = scanner.nextDouble();
            scanner.nextLine(); // Đọc bỏ dòng new line

            // Xác định học lực
            if (scores[i] < 5) {
                grades[i] = "Yếu";
            } else if (scores[i] < 6.5) {
                grades[i] = "Trung bình";
            } else if (scores[i] < 7.5) {
                grades[i] = "Khá";
            } else if (scores[i] < 9) {
                grades[i] = "Giỏi";
            } else {
                grades[i] = "Xuất sắc";
            }
        }

        System.out.println("Thông tin sinh viên:");
        for (int i = 0; i < n; i++) {
            System.out.println("Sinh viên thứ " + (i + 1) + ":");
            System.out.println("Họ tên: " + names[i]);
            System.out.println("Điểm: " + scores[i]);
            System.out.println("Học lực: " + grades[i]);
            System.out.println();
        }

        // Sắp xếp danh sách sinh viên theo điểm (sử dụng thuật toán sắp xếp nổi bọt)
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (scores[j] > scores[j + 1]) {
                    // Hoán đổi điểm
                    double tempScore = scores[j];
                    scores[j] = scores[j + 1];
                    scores[j + 1] = tempScore;

                    // Hoán đổi họ tên
                    String tempName = names[j];
                    names[j] = names[j + 1];
                    names[j + 1] = tempName;

                    // Hoán đổi học lực
                    String tempGrade = grades[j];
                    grades[j] = grades[j + 1];
                    grades[j + 1] = tempGrade;
                }
            }
        }

        System.out.println("Danh sách sinh viên sau khi sắp xếp theo điểm:");
        for (int i = 0; i < n; i++) {
            System.out.println("Sinh viên thứ " + (i + 1) + ":");
            System.out.println("Họ tên: " + names[i]);
            System.out.println("Điểm: " + scores[i]);
            System.out.println("Học lực: " + grades[i]);
            System.out.println();
        }
	}

}
