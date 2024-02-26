package lab4;
import java.util.Scanner;

public class lab4bai4 {
    private String tenSp;
    private double donGia;
    private double giamGia;

    public lab4bai4(String tenSp, double donGia, double giamGia) {
        this.tenSp = tenSp;
        this.donGia = donGia;
        this.giamGia = giamGia;
    }

    public lab4bai4(String tenSp, double donGia) {
        this(tenSp, donGia, 0);
    }

    private double getThueThuNhap() {
        return donGia * 0.1;
    }

    public String getTenSp() {
        return tenSp;
    }

    public void setTenSp(String tenSp) {
        this.tenSp = tenSp;
    }

    public double getDonGia() {
        return donGia;
    }

    public void setDonGia(double donGia) {
        this.donGia = donGia;
    }

    public double getGiamGia() {
        return giamGia;
    }

    public void setGiamGia(double giamGia) {
        this.giamGia = giamGia;
    }

    public void xuat() {
        System.out.println("Tên sản phẩm: " + tenSp);
        System.out.println("Đơn giá: " + donGia);
        System.out.println("Giảm giá: " + giamGia);
        System.out.println("Thuế thu nhập: " + getThueThuNhap());
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Tạo đối tượng sp1 với giảm giá
        System.out.println("Nhập thông tin sản phẩm 1:");
        System.out.print("Nhập tên sản phẩm: ");
        String tenSp1 = scanner.nextLine();
        System.out.print("Nhập đơn giá: ");
        double donGia1 = scanner.nextDouble();
        System.out.print("Nhập giảm giá: ");
        double giamGia1 = scanner.nextDouble();

        lab4bai4 sp1 = new lab4bai4(tenSp1, donGia1, giamGia1);

        // Tạo đối tượng sp2 không có giảm giá
        scanner.nextLine(); // Đọc bỏ dòng new line còn lại
        System.out.println("Nhập thông tin sản phẩm 2:");
        System.out.print("Nhập tên sản phẩm: ");
        String tenSp2 = scanner.nextLine();
        System.out.print("Nhập đơn giá: ");
        double donGia2 = scanner.nextDouble();

        lab4bai4 sp2 = new lab4bai4(tenSp2, donGia2);

        // Xuất thông tin 2 đối tượng sản phẩm
        System.out.println("Thông tin sản phẩm 1:");
        sp1.xuat();

        System.out.println("Thông tin sản phẩm 2:");
        sp2.xuat();
    }
}