package lab4;
import java.util.Scanner;

public class lab4bai2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Tạo đối tượng sp1
        System.out.println("Nhập thông tin sản phẩm 1:");
        System.out.print("Nhập tên sản phẩm: ");
        String tenSp1 = scanner.nextLine();
        System.out.print("Nhập đơn giá: ");
        double donGia1 = scanner.nextDouble();
        System.out.print("Nhập giảm giá: ");
        double giamGia1 = scanner.nextDouble();

        lab4bai1 sp1 = new lab4bai1(tenSp1, donGia1, giamGia1);

        // Tạo đối tượng sp2
        scanner.nextLine(); // Đọc bỏ dòng new line còn lại
        System.out.println("Nhập thông tin sản phẩm 2:");
        System.out.print("Nhập tên sản phẩm: ");
        String tenSp2 = scanner.nextLine();
        System.out.print("Nhập đơn giá: ");
        double donGia2 = scanner.nextDouble();
        System.out.print("Nhập giảm giá: ");
        double giamGia2 = scanner.nextDouble();

        lab4bai1 sp2 = new lab4bai1(tenSp2, donGia2, giamGia2);

        // Xuất thông tin 2 đối tượng sản phẩm
        System.out.println("Thông tin sản phẩm 1:");
        sp1.xuat();

        System.out.println("Thông tin sản phẩm 2:");
        sp2.xuat();
    }
}