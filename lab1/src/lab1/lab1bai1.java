package lab1;
import java.util.Scanner;
public class lab1bai1 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập họ và tên sinh viên: ");
        String hoTen = scanner.nextLine();

        System.out.print("Nhập điểm trung bình: ");
        double diem = scanner.nextDouble();

        System.out.printf("%s %.2f điểm.", hoTen, diem);
	}
}
